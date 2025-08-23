import java.util.*;
public class jail{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of prisners:");
        int n = obj.nextInt();
        System.out.println("Enter the number of candies:");
        int candies = obj.nextInt();
        System.out.println("Enter the number of starting number:");
        int starting = obj.nextInt();

        //find the who is one who will have candie at the end
        //
        int val = n%candies;
        if(val<n/2){
        int result = starting+val;
        }else{
        }
        System.out.println("last person who will have candie is "+ result);


    }
}
