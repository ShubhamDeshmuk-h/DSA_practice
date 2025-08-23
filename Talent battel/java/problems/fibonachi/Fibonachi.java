import java.util.*;
public class Fibonachi{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a = 0, b = 1, sum = a + b,next;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        //in dp we use previous calculation w

        for (int i = 1; i <= n; i++) {
            next = a + b;
            sum += next;
            a = b;
            b = next;
        }
        System.out.print(sum);
        obj.close();
    }
}