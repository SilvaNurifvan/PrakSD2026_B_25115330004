package pekan6_2511533004;
public class InsertDLL_2511533004 {
    // menambahkan node di awal DLL
    static NodeDLL_2511533004 insertBegin(NodeDLL_2511533004 head_3004, int data_3004) {
        // buat node baru
        NodeDLL_2511533004 new_node_3004 = new NodeDLL_2511533004(data_3004);
        // jadikan pointer nextnya head
        new_node_3004.next_3004 = head_3004;
        // jadikan pointer prev head ke new_node
        if (head_3004 != null) {
            head_3004.prev_3004 = new_node_3004;
        }
        return new_node_3004;
    }

    // fungsi menambahkan node di akhir
    public static NodeDLL_2511533004 insertEnd(NodeDLL_2511533004 head_3004, int newData_3004) {
        // buat node baru
        NodeDLL_2511533004 newNode = new NodeDLL_2511533004(newData_3004);
        // jika dll null jadikan head
        if (head_3004 == null) {
            head_3004 = newNode;
        } else {
            NodeDLL_2511533004 curr = head_3004;
            while (curr.next_3004 != null) {
                curr = curr.next_3004;
            }
            curr.next_3004 = newNode;
            newNode.prev_3004 = curr;
        }
        return head_3004;
    }
    //fungsi menambahkan node di posisi tertentu
    public static NodeDLL_2511533004 insertAtPosition(NodeDLL_2511533004 head_3004, int pos_3004, int new_data_3004) {
	    // buat node baru
	    NodeDLL_2511533004 new_node_3004 = new NodeDLL_2511533004(new_data_3004);
	    if (pos_3004 == 1) {
	       new_node_3004.next_3004 = head_3004;
	       if (head_3004 != null) {
	           head_3004.prev_3004 = new_node_3004;
	       }
	       head_3004 = new_node_3004;
	       return head_3004;
	    }
	    NodeDLL_2511533004 curr = head_3004;
	    for (int i = 1; i < pos_3004 - 1 && curr != null; ++i) {
	       curr = curr.next_3004;
	    }
	    if (curr == null) {
	       System.out.println("Posisi tidak ada");
	       return head_3004;
	    }
	    new_node_3004.prev_3004 = curr;
	    new_node_3004.next_3004 = curr.next_3004;
	    curr.next_3004 = new_node_3004;
	    if (new_node_3004.next_3004 != null) {
	       new_node_3004.next_3004.prev_3004 = new_node_3004;
	    }
	    return head_3004;
	    }
	
    public static void printList(NodeDLL_2511533004 head_3004) {
	    NodeDLL_2511533004 curr = head_3004;
	    while (curr != null) {
	       System.out.print(curr.data_3004 + " <-> ");
	       curr = curr.next_3004;
	    }
	    System.out.println();
	    }
	
    public static void main(String[] args) {
    	// membuat dll 2 <-> 3 <-> 5
        NodeDLL_2511533004 head_3004 = new NodeDLL_2511533004(2);
        head_3004.next_3004 = new NodeDLL_2511533004(3);
        head_3004.next_3004.prev_3004 = head_3004;
        head_3004.next_3004.next_3004 = new NodeDLL_2511533004(5);
        head_3004.next_3004.next_3004.prev_3004 = head_3004.next_3004;

        // cetak DLL awal
        System.out.print("DLL Awal: ");
        printList(head_3004);

        // tambah 1 di awal
        System.out.print("simpul 1 ditambah di awal: ");
        head_3004 = insertBegin(head_3004, 1);
        printList(head_3004);

        // tambah 6 di akhir
        System.out.print("simpul 6 ditambah di akhir: ");
        int data_3004 = 6;
        head_3004 = insertEnd(head_3004, data_3004);
        printList(head_3004);

        // menambah node 4 di posisi 4
        System.out.print("tambah node 4 di posisi 4: ");
        int data2_3004 = 4;
        int pos_3004 = 4;
        head_3004 = insertAtPosition(head_3004, pos_3004, data2_3004);
        printList(head_3004);
    }
}