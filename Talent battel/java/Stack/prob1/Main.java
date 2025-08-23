import java.util.*;
public class Main{
    static int[] arr;
    static int top = -1;
    public boolean isfull(){
        int sizeofstack = arr.length;
        if(top == sizeofstack-1){
            return true;
        }else{
            return false;
        }
    }
    public void push(int data){

        int sizeofstack = arr.length;
        if(isfull()){
            top++;
            arr[top+1] = data;
        }else{
            System.out.println("Stack is full");
        }
    }
    public boolean isempty(){
        if(top == -1){
            return false;
        }
        else{
            return true;
        }
    }
    public void pop(){
        if(isempty()){
            top--;
        }
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] input_arr = new int[size];
        for (int i = 0; i < size; i++) {
            input_arr[i] = obj.nextInt();
        }
        Main s = new Main();
        s.push(input_arr[1]);
        System.out.println(arr[1]);

        /*
        do {
            System.out.println("1.Push a element ");
            System.out.println("2.Pop a element ");
            System.out.println("3. Get top element ");
            System.out.println("4. Exit ");

            System.out.println("Enter the case you want to execurte:");
            int c = obj.nextInt();
            switch (c) {
                case 1:
                    //push
                    
                    break;
                case 2:
                    //pop
                    break;
                case 3:
                    //
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (c == 5);
        */
    }
}