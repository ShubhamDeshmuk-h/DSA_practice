import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {-2,-3,4, -1, -2, 1, 5, -3};
        int length = arr.length;
        int max_ending_here = 0;
        int max_so_far = 0;
        for (int i = 0; i < length; i++) {
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
               max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
            max_ending_here = 0;
            }
        System.out.println(max_so_far);
        }
    }
}