import java.util.Scanner;

public class prob2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int val = obj.nextInt();
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += val*i;
        }
        System.out.println(result);
        System.out.println(val*55);
    }
}