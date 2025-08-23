public class prob1{
    Node head;
    public class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
        public void Display(){
            Node p = head;
            while(p != null){
                System.out.print(p.data+"--> ");
                p = p.next;

            }
            System.out.print("null");
        }
    public void insert_end(int data){
        Node newnode = new Node(data);
        Node p = head;
        if(head == null){
            head = newnode;
        }else{
            while(p.next!=null){
                p = p.next;
            }
            p.next = newnode;
        }
    }
    public void add(Node l1, Node l2){

    }
    public static void main(String[] args) {
        //link list 
        //display
        //we have 
        prob1 obj = new prob1();
        obj.insert_end(2);
        obj.insert_end(4);
        obj.insert_end(3);
        obj.Display();
        System.out.println("  ");

        prob1 obj2 = new prob1();
        obj2.insert_end(5);
        obj2.insert_end(6);
        obj2.insert_end(4);
        obj2.Display();

        

        



    }
}