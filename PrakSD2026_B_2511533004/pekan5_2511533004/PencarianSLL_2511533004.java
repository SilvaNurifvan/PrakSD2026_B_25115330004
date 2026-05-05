package pekan5_2511533004;

public class PencarianSLL_2511533004 {
	static boolean searchKey(NodeSLL_2511533004 head, int key) {
        NodeSLL_2511533004 curr = head;
        while (curr != null) {
            if (curr.data_3004 == key)
                return true;
            curr = curr.next_3004;
        }
        return false;
    }
    public static void traversal(NodeSLL_2511533004 head) {
        //mulai dari head
        NodeSLL_2511533004 curr = head;
        //telusuri sampai pointer null
        while (curr != null) {
            System.out.print(" " + curr.data_3004);
            curr = curr.next_3004;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        NodeSLL_2511533004 head = new NodeSLL_2511533004(14);
        head.next_3004 = new NodeSLL_2511533004(21);
        head.next_3004.next_3004 = new NodeSLL_2511533004(13);
        head.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(30);
        head.next_3004.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(10);
        System.out.print("Penelusuran SLL : ");
        traversal(head);
        // data yang akan dicari
        int key = 30;
        System.out.print("cari data " + key + " = ");
        if (searchKey(head, key))
            System.out.println("ketemu");
        else
            System.out.println("tidak ada");
    }
}