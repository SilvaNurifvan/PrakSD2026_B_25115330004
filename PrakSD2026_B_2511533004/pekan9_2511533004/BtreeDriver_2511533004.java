package pekan9_2511533004;

public class BtreeDriver_2511533004 {
	    public static void main(String[] args) {
	        //Membuat Pohon
	        BTree_2511533004 tree_3004 = new BTree_2511533004();
	        System.out.print("Jumlah Simpul awal pohon: ");
	        System.out.println(tree_3004.countNodes());

	        //menambahkan simpul data 1
	        Node_2511533004 root = new Node_2511533004(1);
	        //menjadikan simpul 1 sebagai root
	        tree_3004.setRoot_3004(root);
	        System.out.println("Jumlah simpul jika hanya ada root");
	        System.out.println(tree_3004.countNodes());

	        Node_2511533004 node2 = new Node_2511533004(2);
	        Node_2511533004 node3 = new Node_2511533004(3);
	        Node_2511533004 node4 = new Node_2511533004(4);
	        Node_2511533004 node5 = new Node_2511533004(5);
	        Node_2511533004 node6 = new Node_2511533004(6);
	        Node_2511533004 node7 = new Node_2511533004(7);
	        Node_2511533004 node8 = new Node_2511533004(8);
	        Node_2511533004 node9 = new Node_2511533004(9);

	        root.setLeft(node2);
	        node2.setLeft(node4);
	        node2.setRight(node5);
	        node4.setRight(node8);
	        root.setRight(node3);
	        node3.setLeft(node6);
	        node3.setRight(node7);
	        node6.setLeft(node9);

	        //Set root
	        tree_3004.setCurrent(tree_3004.getRoot());
	        System.out.println("\nmenampilkan simpul terakhir: ");
	        System.out.println(tree_3004.getCurrent().getData());
	        System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan");
	        System.out.println(tree_3004.countNodes());

	        System.out.println("InOrder: ");
	        tree_3004.printInorder();

	        System.out.println("\nPreorder: ");
	        tree_3004.printPreOrder();

	        System.out.println("\nPostorder : ");
	        tree_3004.printPostOrder();

	        System.out.println("\nMenampilkan simpul dalam bentuk pohon");
	        tree_3004.print();
	    }
	}