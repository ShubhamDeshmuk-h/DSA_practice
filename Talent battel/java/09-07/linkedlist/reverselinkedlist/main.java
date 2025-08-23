
public class main {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

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

        public void display() {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " --> ");
                p = p.next;
            }
            System.out.println("null");
        }

        public int count() {
            Node p = head;
            int count = 0;
            while (p != null) {
                p = p.next;
                count++;
            }
            return count;
        }

        public void reverse() {
            Node current = head;
            Node next;
            Node previous = null;

            while (current != null) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;

            // Display reversed list
            Node p = head;
            while (p != null) {
                System.out.print(p.data + " --> ");
                p = p.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        LinkedList s = new LinkedList();

        s.insert_end(10);
        s.insert_end(20);
        s.insert_end(30);
        s.insert_end(40);
        s.insert_end(50);

        System.out.println("Original List:");
        s.display();

        System.out.println("Count of nodes: " + s.count());

        System.out.println("Reversed List:");
        s.reverse();

        obj.
    }
}
