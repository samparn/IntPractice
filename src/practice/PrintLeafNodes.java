package practice;

public class PrintLeafNodes {
    static class Node {
        public int data;
        public Node left, right;
    }

    ;

    // Utility function to create a new tree node
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    // Driver code
    public static void main(String[] args) {

        // Let us create binary tree shown in
        // above diagram
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.right.left = newNode(5);
        root.right.right = newNode(8);
        root.right.left.left = newNode(6);
        root.right.left.right = newNode(7);
        root.right.right.left = newNode(9);
        root.right.right.right = newNode(10);

        // Print leaf nodes of the given tree
        printLeafNodes(root);
    }

    static void printLeafNodes(Node root) {
        // If node is null, return
        if (root == null)
            return;
        if(root.right ==null && root.left == null)
        {
            System.out.print(root.data);
        }
//        if (root.left != null)
            printLeafNodes(root.left);
//        if (root.right != null)
            printLeafNodes(root.right);

    }

}
