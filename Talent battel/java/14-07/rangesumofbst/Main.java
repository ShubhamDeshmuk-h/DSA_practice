
public class Main {

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    Main() {
        root = null;
    }

    Node insert(Node root, int data) {
        if (data == -1) return root; // Skip inserting -1 (invalid node)
        
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

    // ✅ Corrected Rangesum function
    int Rangesum(int low, int high, Node root) {
        if (root == null)
            return 0;

        if (root.data < low)
            return Rangesum(low, high, root.right);
        else if (root.data > high)
            return Rangesum(low, high, root.left);
        else
            return root.data + Rangesum(low, high, root.left) + Rangesum(low, high, root.right);
    }

    // Inorder traversal
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
        Main bt = new Main();

        int arr[] = {10, 5, 15, 3, 7, -1, 18};
        int arr1[] = {10, 5, 15, 3, 7, 13, 10, 1, -1, 6};

        for (int value : arr) {
            bst.insert(value);
        }
        for (int value : arr1) {
            bt.insert(value);
        }

        int low = 7;
        int high = 15;

        System.out.println("Range Sum (7 to 15): " + bst.Rangesum(low, high, bst.root));
        bst.display();  // Display inorder
    }
}
