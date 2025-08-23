import java.util.Scanner;
public class Main{
    static class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList{
        Node head;


        //inserts at the end of the array
        
        public void insert_end(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }


        //displays the linked list

        public void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " --> ");
                p = p.next;
            }
            System.out.println("null");
        }

        //displays the count of linked list

        public int count() {
            Node p = head;
            int count = 0;
            while (p != null) {
                p = p.next;
                count++;
            }
            return count;
        }

        public void delete_element_begineeing(){
            head = head.next;
            
        }

        public void delete_element_end(){
            Node current = head;
            Node previous = null;
            while(current != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            
        }




    }
    public static void main(String arg[]){
        LinkedList s = new LinkedList();
        Scanner obj = new Scanner(System.in);
        s.insert_end(10);
        s.insert_end(20);
        s.insert_end(30);
        s.insert_end(40);
        s.insert_end(50);

        System.out.println("Original List:");
        s.display();

        System.out.println("Count of nodes: " + s.count());

        s.delete_element_begineeing();
        s.display();
        s.delete_element_end();
        s.display();
    }
}