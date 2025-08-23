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
    public static void commonancister(int data,int data1, Node root){
        if(root.data == -1){
            return;
        }
        if(root.data>data && root.data>data1){
            commonancister(data, data1, root.left);
        }else if(root.data<data && root.data<data1){
            commonancister(data, data1, root.right);
        }else{
            System.out.println(root.data);
            return;
        }
    }

    // ---------- MAIN FUNCTION ----------
    public static void main(String[] args) {
        Main bst = new Main();

        int arr[] = {6,2,8,0,4,7,9,-1,3,5};
        for (int i = 0; i < arr.length; i++) {
            bst.insert(i);
        }

        commonancister(2,8,bst.root);
        bst.display();  // Final tree
    }
}
