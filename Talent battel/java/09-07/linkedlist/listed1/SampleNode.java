import java.util.Scanner;

public class SampleNode{
    static Node head;

    private static class Node{
        private int data;
        private Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert_end(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next=newNode;
        }
    }

    public void insert_beginning(int data){
        Node newNode = new Node(data);

        if (head==null){
            head=newNode;
        }
        else{
            newNode.next = head;

            head= newNode;
        }
    }

    public void insert_middle(int target, int data){
        Node p = head;
        Node newNode = new Node(data);

        while (p.data!=target){
            p = p.next;
        }  

        newNode.next = p.next;
        p.next= newNode;      
    }

    public void countnodes(){
        Node current = head;
        int count=0;

        while (current!=null){
            current = current.next;
            count++;
        }

    

        System.out.println();
        System.out.println("The number of nodes is "+count);
    }

    public void search(int target){
        Node p = head;

        while (p!=null){
            if (p.data==target){
                System.out.println("Element Found.");
                return;
            }
            p=p.next;
        }
        System.out.println("Element Not Found.");
    }

    public void display(){
        Node p = head;
        while (p!=null){
            System.out.print(p.data+" -->  ");
            p=p.next;
            if (p==head){
                break;
            }
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        SampleNode s = new SampleNode();

        s.insert_end(10);
        s.insert_end(20);
        s.insert_end(30);
        s.insert_beginning(5);
        s.insert_middle(20,25);

        s.display();

        /*s.countnodes();

        System.out.println("Enter the value you want to search: ");
        int target = obj.nextInt();

        s.search(target);*/
    }
}