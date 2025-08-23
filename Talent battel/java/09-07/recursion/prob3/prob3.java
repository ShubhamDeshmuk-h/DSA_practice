import java.util.*;
public class prob3{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int x = obj.nextInt();
        int n = obj.nextInt();
        System.out.println(magic(x,n));
        
    }
    public static int magic(int x,int n){
        int pow = 0;
        int val = 0;
        while(x!=0){
            int num = (x%10)+n;
            int num2 = num%10;
            val += (num2* Math.pow(10, pow));
            x = x/10;
            pow++;
        }
        return val;

    }
}