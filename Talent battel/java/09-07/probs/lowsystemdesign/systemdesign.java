import java.util.*;

public class systemdesign{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("enter marks:");
        int m = obj.nextInt();
        Student s = new Student(m);
        s.display();

        Node temp = new Node(m);
    }
}
//create nodes and data of linked list
/
class Node{
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class Student{
    private int marks;
    Student(int marks){
        this.marks = marks;
    }
    public void display(){
        System.out.println("Marks of student are:"+marks);
    }

}