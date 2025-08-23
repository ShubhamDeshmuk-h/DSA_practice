import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size =  obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 1; i < size; i++) {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                System.out.println("index "+i+" is peak"+arr[i]);
                break;
            }
        }

    }
}