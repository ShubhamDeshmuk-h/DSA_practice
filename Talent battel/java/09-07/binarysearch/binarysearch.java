import java.util.*;
public class binarysearch{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size  = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int x  = obj.nextInt();

        int start = 0;
        int end  = (arr.length)-1;
        System.out.print(binarysear(arr, x, start, end));
        obj.close();
        
    }

    //how binary search works
    //array input is check for the input if arr[mid] == x return 
    
    public static int binarysear(int[] arr, int x, int start, int end) {
        int mid = start + (end - start)/2;
        if(arr[mid] == x){
            return mid;
        }else{ 
            if(arr[mid] < x){
                return binarysear(arr, x, mid+1, end);
            }
            else{
                return binarysear(arr, x, start, mid-1);
            }
        }
    }
}