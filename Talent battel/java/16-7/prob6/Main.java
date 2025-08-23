import java.util.*;
public class Main{
    public static void main(String[] args) {
        //give number
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        int sum2 = 0;
        for (int i = 0; i < size; i++){
            sum2 += arr[i];
            int result = sum-sum2;
            System.out.println(result+" ");
        }
    }
}