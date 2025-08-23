import java.util.Scanner;

public class prob1 {
    // Node class for the linked list
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    // Function to insert node at beginning
    static Node insertAtBeginning(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }
    
    // Function to print the linked list
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        
        // Input number of nodes
        int n = scanner.nextInt();
        
        // Input node values and insert at beginning
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = insertAtBeginning(head, data);
        }
        
        // Print the linked list
        printList(head);
        
        scanner.close();
    }
}