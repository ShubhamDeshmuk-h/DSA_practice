import java.util.*;

public class Main {
    private int front = 0;
    private int rear = 0;
    private int[] que;
    private int size;

    public Main(int size) {
        this.size = size;
        que = new int[size];
    }     


    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        que[rear] = val;
        rear++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(que[front] + ": Element removed");
        front++;
    }

    public boolean isFull() {
        return rear == size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + que[front]);
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i < rear; i++) {
            System.out.print(que[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter size of the queue: ");
        int size = obj.nextInt();
        Main s = new Main(size);
        System.out.println("Enter " + size + " elements to enqueue:");
        for (int i = 0; i < size; i++) {
            s.enqueue(obj.nextInt());
        }

        s.display();
        s.peek();

        System.out.println("Performing dequeue:");
        s.dequeue();
        s.peek();
        s.display();
    }
}
