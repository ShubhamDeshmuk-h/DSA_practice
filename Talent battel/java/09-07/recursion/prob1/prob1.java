
import java.util.*;

public class prob1{
    public static int fact(int num){
            if(num == 1){
                return 1;
            }else{
                return num*fact(num-1);
            }
        }
    public static void main(String[] args) {
        //perform factorial on equations 
        //use while because we don't know how many iterations are required for the application
        //
        Scanner obj = new Scanner(System.in);
        int sum = 0;
        int num = obj.nextInt();
        //input hase bin taken now we will function it
        int temp = num;
        while(num!=0){
            int digit = num%10;
            sum += fact(digit);
            num = num/10;
        }
        if(sum == temp){
            System.out.println("Yes");
        
        }else{
            System.out.println("No");
        }
    }
}