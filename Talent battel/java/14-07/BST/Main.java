import java.util.Scanner;
public class Main{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    /*public static Node BST(int[] arr, int left, int right){
            if (left>right){
                return null;
            }
            int mid = left + (right-left)/2;
            Node newNode = new Node(arr[mid]);
            newNode.left = BST(arr, left, mid-1);
            newNode.right = BST(arr, mid+1, right);

            return newNode;
        }
    */

    public static Node insert(Node root, int data){
        if (root == null){
            return new Node(data);
        }
        
        if (data< root.data){
            root.left = insert(root.left, data);
        }
        else{
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void inorder(Node node){
            if (node==null){
                return;
            }
            inorder(node.left);
            System.out.print(node.data+" ");
            inorder(node.right);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Main binary = new Main();

        int[] arr = {81,23,78,45,9,2,4,19,100,123,145,6};
        Node root = null;

        for (int i=0; i<arr.length; i++){
            root = binary.insert(root, arr[i]);
        }

        binary.inorder(root);
    }
}