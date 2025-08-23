import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of starts");
        int n = obj.nextInt();
        for (int i = 0; i < n ;i++){
            for (int j= 0; j< i+1;j++){
                System.out.print("*");
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}