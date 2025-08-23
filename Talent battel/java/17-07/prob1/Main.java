import java.util.*;
public class Main{
    //can use two pointer if compare and check
    //if 
    public int longestmaxele(int[] arr){
        if(arr.length <= 1){
            return 0;
        }
        /*
        int len = arr.length;
        int cnt = 1;
        int cnt2 = 1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])cnt = cnt2 + 1;
            if(arr[i]<arr[i+1])cnt2 = cnt + 1;
        }*/
        int count = 1; // first element is always part of alternating
        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) ||
                (arr[i - 1] > arr[i] && arr[i] < arr[i + 1])) {
                count++;
            }
        }
        return count + 1;
    }
       //return Math.max(cnt, cnt2);
    public static void main(String[] args) {
        //need logic of finding alternumber//i+2
        Scanner obj = new Scanner(System.in);
        //int[] arr = {3,5,4};
        int[] arr = {1,17,5,10,13,15,10,5,16,8};
        Main s = new Main();
        int result = s.longestmaxele(arr);
        System.out.println(result);

        
    }
}