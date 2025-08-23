
class Treetraversal {

    static class Node {
        int data;
        Node lchild;
        Node rchild;

        Node(int data) {
            this.data = data;
            lchild = null;
            rchild = null;
        }
    }

    Node root;

    // Constructor with root
    Treetraversal(Node node) {
        root = node;
    }

    // Inorder traversal (Left, Root, Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.lchild);
        System.out.print(node.data + " ");
        inorder(node.rchild);
    }

    // Postorder traversal (Left, Right, Root)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.lchild);
        postorder(node.rchild);
        System.out.print(node.data + " ");
    }
    void preorder(Node node) {
        if (node == null) return;
        preorder(node.lchild);
        preorder(node.rchild);
        System.out.print(node.data + " ");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating nodes manually
        Treetraversal.Node root = new Treetraversal.Node(78);
        root.lchild = new Treetraversal.Node(45);
        root.rchild = new Treetraversal.Node(32);

        root.lchild.lchild = new Treetraversal.Node(12);
        root.lchild.rchild = new Treetraversal.Node(100);

        root.rchild.lchild = new Treetraversal.Node(7);
        root.rchild.rchild = new Treetraversal.Node(98);

        root.rchild.lchild.lchild = new Treetraversal.Node(20);

        Treetraversal tree = new Treetraversal(root);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println();

        System.out.print("Postorder Traversal: ");
        tree.postorder(tree.root);

        System.out.println();

        System.out.print("Preorder Traversal: ");
        tree.preorder(tree.root);

    }
}
