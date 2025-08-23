import java.util.*;
public class Main{
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the i:");
        int num = obj.nextInt();
        System.out.println("Enter the U:");
        int u = obj.nextInt();
        System.out.println("Enter the x:");
        int x = obj.nextInt();
        int counter = 0;
        for(int i = num ; i<=u;i++){
            int val = i;
            while(val>0){
                int d= val%10;
                if( d == x){
                    counter++;
                }
                val = val/10;
            }
        }
        System.out.println("Occurance of x from i to u is:"+counter);
    }
}