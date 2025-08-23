import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter value of starts");
        int n = obj.nextInt();
        for (int i = 1; i <= n ;i++){
            for (int j= 1;j<2+i;j++){
                System.out.print(i);
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
}