import java.util.*;
public class Main{
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    public static class Tree{
        Node root;

        Tree(){
            root = null;
        }

        public void preorder(Node node){
            if (node==null){
                return;
            }
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }

        public void postorder(Node node){
            if (node==null){
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }

        public void inorder(Node node){
            if (node==null){
                return;
            }
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }

            
    public List<String> trackpaths(Node root){
        List<String> result = new ArrayList<>();
        backtrack(root,"",result);
        return result;
    }
        void backtrack(Node node,String path, List<String> result){
            if(node ==null)return;
            path = path + node.data;
            if(node.left==null && node.right == null){
                result.add(path);
            }else{
                path = path + "-->";
                backtrack(node.left, path, result);
                backtrack(node.right, path, result);
            }
    }

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,5};

        Tree t = new Tree();
        t.root = new Node(arr[0]);
        t.root.left = new Node(arr[1]);
        t.root.right = new Node(arr[2]);
        t.root.left.right = new Node(5);

        System.out.println("Inorder Traversal: ");
        t.inorder(t.root);
        System.out.println("");
        System.out.println("Path: "); 
        System.out.println(t.trackpaths(t.root)); 

    }
}