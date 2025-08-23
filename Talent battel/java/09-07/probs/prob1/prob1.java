import java.util.*;
public class prob1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //company gives employees and their efficencey and arr can be negative
        // need to find the maximum efficiency of employ
        //multiply there individual efficienct

        //two possible  --+ and +++
        //what should
        System.out.print("Enter total number of array: ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(multiple(arr, size));
    }
    
    public static int multiple(int[] arr, int size){
        int mul1 = arr[0]*arr[1]*arr[2];
        int mul2 = arr[size-3]*arr[size-2]*arr[size-1];

        if(mul1>mul2){
            return mul1;
        }else{
            return mul2;
        }
    }
}