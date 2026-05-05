package pekan5_2511533004;

public class TambahSLL_2511533004 {
	public static NodeSLL_2511533004 insertAtFront(NodeSLL_2511533004 head, int value) {
        NodeSLL_2511533004 new_node = new NodeSLL_2511533004(value);
        new_node.next_3004 = head;
        return new_node;
    }
    // fungsi menambahkan node di akhir SLL
    public static NodeSLL_2511533004 insertAtEnd(NodeSLL_2511533004 head, int value) {
        // buat sebuah node dengan sebuah nilai
        NodeSLL_2511533004 newNode = new NodeSLL_2511533004(value);
        // jika list kosong maka node jadi head
        if (head == null) {
            return newNode;
        }
        // simpan head ke variabel sementara
        NodeSLL_2511533004 last = head;
        // telusuri ke node akhir
        while (last.next_3004 != null) {
            last = last.next_3004;
        }
        // ubah pointer
        last.next_3004 = newNode;
        return head;
    }
    static NodeSLL_2511533004 GetNode(int data_3004) {
        return new NodeSLL_2511533004(data_3004);
    }
    static NodeSLL_2511533004 insertPos(NodeSLL_2511533004 headNode, int position, int value) {
    	NodeSLL_2511533004 head = headNode;

    	if (position < 1) {
    		System.out.print("Invalid position");
    }

    	if (position == 1) {
    		NodeSLL_2511533004 new_node = new NodeSLL_2511533004(value);
    		new_node.next_3004 = head;
    		return new_node;
    } 	else {
    		while (position-- != 0) {
    			if (position == 1) {
    				NodeSLL_2511533004 newNode = GetNode(value);
    				newNode.next_3004 = headNode.next_3004;
                	headNode.next_3004 = newNode;
                	break;
            }
            headNode = headNode.next_3004;
        }

        if (position != 1) {
            System.out.print("Posisi di luar jangkauan");
        }
        return head;
    }
}
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
    public static void main(String[] args) {
        // buat linked list 2->3->5->6
        NodeSLL_2511533004 head = new NodeSLL_2511533004(2);
        head.next_3004 = new NodeSLL_2511533004(3);
        head.next_3004.next_3004 = new NodeSLL_2511533004(5);
        head.next_3004.next_3004.next_3004 = new NodeSLL_2511533004(6);
        // cetak list asli
        System.out.print("Senarai berantai awal:");
        printList(head);
        // tambahkan node baru di depan
        System.out.print("tambah 1 simpul di depan: ");
        int data = 1;
        head = insertAtFront(head, data);
        // cetak update list
        printList(head);
        // tambahkan node baru di belakang
        System.out.print("tambah 1 simpul di belakang: ");
        int data2 = 7;
        head = insertAtEnd(head, data2);
        // cetak update list
        printList(head);
        System.out.print("tambah 1 simpul ke data 4: ");
        int data3 = 4;
        int pos = 4;
        head = insertPos(head, pos, data3);
        // cetak update list
        printList(head);
    }
}