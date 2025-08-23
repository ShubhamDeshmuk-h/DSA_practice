class Treetraversal {
    static class Node {
        int data;
        Node lchild;
        Node rchild;

        Node(int n) {
            data = n;
            lchild = null;
            rchild = null;
        }
    }

    Node root;

    public Treetraversal(Node node) {
        root = node;
    }

    public Treetraversal() {
        root = null;
    }

    // Preorder traversal (Root → Left → Right)
    void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.lchild);
        preorder(node.rchild);
    }

    //method to build a binary tree from an array (like a complete binary tree)
    public static Node buildTreeFromArray(int[] arr, int i) {
        if (i >= arr.length) return null;
        Node node = new Node(arr[i]);
        node.lchild = buildTreeFromArray(arr, 2 * i + 1);
        node.rchild = buildTreeFromArray(arr, 2 * i + 2);
        return node;
    }
}

public class Main{
    public static void main(String[] args) {
        Treetraversal.Node s = new Treetraversal.Node(10);


        int[] arr = {12,7,14,23,9,5,8,100,25,45};
        Treetraversal tree = new Treetraversal();
        tree.root = tree.buildTreeFromArray(arr, 0);

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);
    }
}