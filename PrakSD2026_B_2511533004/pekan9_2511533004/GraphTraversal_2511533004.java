package pekan9_2511533004;
import java.util.*;

public class GraphTraversal_2511533004 {
    // Tambah akhiran _3004 pada variabel
    private Map<String, List<String>> graph_3004 = new HashMap<>();

    // Tambah akhiran _3004 pada nama metode & parameter
    public void addEdge_3004(String node1_3004, String node2_3004) {
        graph_3004.putIfAbsent(node1_3004, new ArrayList<>());
        graph_3004.putIfAbsent(node2_3004, new ArrayList<>());
        graph_3004.get(node1_3004).add(node2_3004);
        graph_3004.get(node2_3004).add(node1_3004);
    }

    // Tambah akhiran _3004 pada nama metode
    public void printGraph_3004() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3004 : graph_3004.keySet()) {
            System.out.print(node_3004 + " -> ");
            List<String> neighbors_3004 = graph_3004.get(node_3004);
            System.out.println(String.join(", ", neighbors_3004));
        }
        System.out.println();
    }

    // Tambah akhiran _3004 pada nama metode & parameter
    public void dfs_3004(String start_3004) {
        Set<String> visited_3004 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper_3004(start_3004, visited_3004);
        System.out.println();
    }

    private void dfsHelper_3004(String current_3004, Set<String> visited_3004) {
        if (visited_3004.contains(current_3004)) return;
        visited_3004.add(current_3004);
        System.out.print(current_3004 + " ");
        for (String neighbor_3004 : graph_3004.getOrDefault(current_3004, new ArrayList<>())) {
            dfsHelper_3004(neighbor_3004, visited_3004);
        }
    }

    // Tambah akhiran _3004 pada nama metode & parameter
    public void bfs_3004(String start_3004) {
        Set<String> visited_3004 = new HashSet<>();
        Queue<String> queue_3004 = new LinkedList<>();
        queue_3004.add(start_3004);
        visited_3004.add(start_3004);

        System.out.println("Penelusuran BFS:");
        while (!queue_3004.isEmpty()) {
            String current_3004 = queue_3004.poll();
            System.out.print(current_3004 + " ");
            for (String neighbor_3004 : graph_3004.getOrDefault(current_3004, new ArrayList<>())) {
                if (!visited_3004.contains(neighbor_3004)) {
                    queue_3004.add(neighbor_3004);
                    visited_3004.add(neighbor_3004);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphTraversal_2511533004 graph_3004 = new GraphTraversal_2511533004();

        // DI BAGIAN INI TETAP POLOS, TANPA AKHIRAN _3004
        graph_3004.addEdge_3004("A", "B");
        graph_3004.addEdge_3004("A", "C");
        graph_3004.addEdge_3004("B", "D");
        graph_3004.addEdge_3004("B", "E");

        System.out.println("Graf Awal adalah:");
        graph_3004.printGraph_3004();

        // Jalankan penelusuran (nilai simpul tetap A, tanpa NIM)
        graph_3004.dfs_3004("A");
        graph_3004.bfs_3004("A");
    }
}