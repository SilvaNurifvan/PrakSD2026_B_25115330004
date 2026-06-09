package pekan9_2511533004;

public class Node_2511533004 {
    int data_3004;
    Node_2511533004 left_3004;
    Node_2511533004 right_3004;

    public Node_2511533004(int data) {
        this.data_3004 = data;
        this.left_3004 = null;
        this.right_3004 = null;
    }

    public void setLeft(Node_2511533004 node) {
        if (left_3004 == null) {
            left_3004 = node;
        }
    }

    public void setRight(Node_2511533004 node) {
        if (right_3004 == null) {
            right_3004 = node;
        }
    }

    public Node_2511533004 getLeft() {
        return left_3004;
    }

    public Node_2511533004 getRight() {
        return right_3004;
    }

    public int getData() {
        return data_3004;
    }

    public void setData(int data) {
        this.data_3004 = data;
    }

    void printPreorder(Node_2511533004 node) {
        if (node == null) return;
        System.out.print(node.data_3004 + " ");
        printPreorder(node.left_3004);
        printPreorder(node.right_3004);
    }

    void printPostorder(Node_2511533004 node) {
        if (node == null) return;
        printPostorder(node.left_3004);
        printPostorder(node.right_3004);
        System.out.print(node.data_3004 + " ");
    }

    void printInorder(Node_2511533004 node) {
        if (node == null) return;
        printInorder(node.left_3004);
        System.out.print(node.data_3004 + " ");
        printInorder(node.right_3004);
    }

    public String print() {
        return print("", true, "");
    }

    public String print(String prefix, boolean isTail, String sb) {
        if (right_3004 != null) {
            right_3004.print(prefix + (isTail ? "|   " : "    "), false, sb);
        }
        
        System.out.println(prefix + (isTail ? "\\-- " : "/-- ") + data_3004);
        
        if (left_3004 != null) {
            left_3004.print(prefix + (isTail ? "    " : "|   "), true, sb);
        }
        return sb;
    }
}