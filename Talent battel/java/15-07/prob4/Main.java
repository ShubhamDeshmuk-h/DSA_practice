
import java.util.*;
;

public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        int sum = arr[0] + arr[2];
        System.out.print(sum);
    }
}