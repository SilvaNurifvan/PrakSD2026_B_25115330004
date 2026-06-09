package pekan9_2511533004;

public class BTree_2511533004 {
	    private Node_2511533004 root_3004;
	    private Node_2511533004 currentNode_3004;
	    public BTree_2511533004() {
	        root_3004 = null;
	    }
	    public boolean search(int data_3004) {
	        return search(root_3004, data_3004);
	    }
	    private boolean search(Node_2511533004 node_3004, int data_3004) {
	        if (node_3004.getData() == data_3004)
	            return true;
	        if (node_3004.getLeft() != null)
	            if (search(node_3004.getLeft(), data_3004))
	                return true;
	        if (node_3004.getRight() != null)
	            if (search(node_3004.getRight(), data_3004))
	                return true;
	        return false;
	    }
	    public void printInorder() {
	        root_3004.printInorder(root_3004);
	    }
	    public void printPreOrder() {
	        root_3004.printPreorder(root_3004);
	    }
	    public void printPostOrder() {
	        root_3004.printPostorder(root_3004);
	    }
	    public Node_2511533004 getRoot() {
	        return root_3004;
	    }
public boolean isEmpty() {
    return root_3004 == null;
}

public int countNodes() {
    return countNodes(root_3004);
}

private int countNodes(Node_2511533004 node) {
    int count = 1;
    if (node == null) {
        return 0;
    } else {
        count += countNodes(node.getLeft());
        count += countNodes(node.getRight());
        return count;
    }
}

public void print() {
    root_3004.print();
}

public Node_2511533004 getCurrent() {
    return currentNode_3004;
}

public void setCurrent(Node_2511533004 node) {
    this.currentNode_3004 = node;
}

public void setRoot_3004(Node_2511533004 root) {
    this.root_3004 = root;
}
}