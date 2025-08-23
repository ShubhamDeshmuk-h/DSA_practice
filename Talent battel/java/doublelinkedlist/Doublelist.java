import java.util.*;
public class Doublelist{
    Node head;
    public class Node{
        private Node previous;
        private int data;
        private Node next;
        Node(int data){
            this.previous = null;
            this.data = data;
            this.next = null;

        }
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

    public void insert_end(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
        Node current = head;
        while (current.next!=null){
            current = current.next;
        }

        current.next=newNode;
        newNode.previous = current;
        }

    }

    public void insert_begineening(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;

        }else{
        newNode.next = head;
        head.previous = newNode;
        head = newNode;

        }
    }
    public void insert_middle(int data, int target){
        Node newNode  = new Node(data);
        Node previous = null;
        Node current  = head;
        while(current.data != target){
            previous = current;
            current  = current.next;
        }
        newNode.next = current;
        current.previous = newNode;
        previous.next = newNode;
        newNode.previous = previous;

    }
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        Doublelist s = new Doublelist();
        s.insert_end(10);
        s.insert_end(20);
        s.insert_end(30);
        s.insert_end(40);
        s.insert_middle(25, 30);
        s.display();
        
    }

}