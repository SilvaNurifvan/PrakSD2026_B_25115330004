package pekan5_2511533004;

public class HapusSLL_2511533004 {
	 // fungsi untuk menghapus head
    public static NodeSLL_2511533004 deleteHead(NodeSLL_2511533004 head) {
        // jika SLL kosong
        if (head == null)
            return null;
        // pindahkan head ke node berikutnya
        head = head.next_3004;
        // Return head baru
        return head;
    }
    // fungsi menghapus node terakhir SLL
    public static NodeSLL_2511533004 removeLastNode(NodeSLL_2511533004 head) {
        // jika list kosong, return null
        if (head == null) {
            return null;
        }
        // jika list satu node, hapus node dan return null
        if (head.next_3004 == null) {
            return null;
        }
        // temukan node terakhir ke dua
        NodeSLL_2511533004 secondLast = head;
        while (secondLast.next_3004.next_3004 != null) {
            secondLast = secondLast.next_3004;
        }
        // hapus node terakhir+
        secondLast.next_3004 = null;
        return head;
    }
	//fungsi menghapus node di posisi tertentu
	public static NodeSLL_2511533004 deleteNode(NodeSLL_2511533004 head, int position) {
		 NodeSLL_2511533004 temp = head;
		 NodeSLL_2511533004 prev = null;
		
		 // jika linked list null
		 if (temp == null)
		     return head;
		
		 // kasus 1: head dihapus
		 if (position == 1) {
		     head = temp.next_3004;
		     return head;
		 }
		
		 // kasus 2: menghapus node di tengah
		 // telusuri ke node yang dihapus
	for (int i = 1; temp != null && i < position; i++) {
			prev = temp;
		    temp = temp.next_3004;
		 }
		
		 // jika ditemukan, hapus node
		 if (temp != null) {
		     prev.next_3004 = temp.next_3004;
		 } else {
		     System.out.println("Data tidak ada");
		 }
		 return head;
		}
	//fungsi mencetak SLL
	public static void printList(NodeSLL_2511533004 head) {
		NodeSLL_2511533004 curr = head;
			while (curr.next_3004 != null) {
				System.out.print(curr.data_3004 + "-->");
				curr = curr.next_3004;
		 }
		
		 if (curr.next_3004 == null) {
		     System.out.print(curr.data_3004);
		 }
		 System.out.println();
		}
	//kelas main
	public static void main(String[] args) {
	  // buat SLL 1 -> 2 -> 3 -> 4 -> 5-> 6 -> null
	  NodeSLL_2511533004 head = new NodeSLL_2511533004(1);
	  head.next_3004 = new NodeSLL_2511533004(2);
	  head.next_3004.next_3004 = new NodeSLL_2511533004(3);
	  head.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(4);
	  head.next_3004.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(5);
	  head.next_3004.next_3004.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(6);
	  // cetak list awal
	  System.out.println("list awal: ");
	  printList(head);
	  // hapus head
	  head = deleteHead(head);
	  System.out.println("List setelah head dihapus: ");
	  printList(head);
	  //hapus node terakhir
	  head = removeLastNode(head);
	  System.out.println("List setelah simpul terakhir di hapus: ");
	  printList(head);
	  // Deleting node at position 2
	  int position = 2;
	  head = deleteNode(head, position);
	  // Print list after deletion
	  System.out.println("List setelah posisi 2 dihapus: ");
	  printList(head);
	}
}