package sorting;
import java.util.*;
public class sorting{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println();
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int val = 0;
        int x = obj.nextInt();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(x == arr[i]){
                val = 1;
                break;
            }
            else{
                val = 0;
            }
        
        }

        System.out.println(val);
        obj.close();        
    }
    
}