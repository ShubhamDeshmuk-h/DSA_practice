import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int sum = 0;
        //divisibilty is addition of all is divisible by 3

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
        }

        for (int i = 0; i < arr.length; i++) {
            if((sum-arr[i])%3==0){
                System.out.println("Element divisible by 3 is:"+(sum-arr[i]));
                break;
            }
            else if((sum-(arr[i]+arr[i+1])%3==0 && i<size-1)){
                System.out.println("Element divisible by 3 is:"+(sum-(arr[i]+arr[i+1])));
                break;
            }
            
        }
        
    }
}