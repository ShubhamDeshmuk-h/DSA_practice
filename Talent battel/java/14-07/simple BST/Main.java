public class Main {

    // Node class
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root node of BST
    Node root;

    // Constructor
    Main() {
        root = null;
    }

    // ---------- INSERTION ----------
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    void insert(int data) {
        root = insert(root, data);
    }

    // ---------- DELETION ----------
    Node delete(Node root, int data) {
        if (root == null)
            return root;

        if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        else {
            // Case 1: Leaf node or only one child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 2: Two children – find inorder successor (min in right subtree)
            root.data = minValue(root.right);
            // Delete the inorder successor
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    void delete(int data) {
        root = delete(root, data);
    }

    int minValue(Node root) {
        int min = root.data;
        while (root.left != null) {
            root = root.left;
            min = root.data;
        }
        return min;
    }

    // ---------- INORDER TRAVERSAL (For display) ----------
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void display() {
        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();
    }

    // ---------- MAIN FUNCTION ----------
    public static void main(String[] args) {
        Main bst = new Main();

        // INSERTING NODES
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.display();  // Should print sorted BST

        // DELETING NODES
        bst.delete(20);  // Leaf
        bst.delete(30);  // Node with one child
        bst.delete(50);  // Node with two children

        bst.display();  // Final tree
    }
}
