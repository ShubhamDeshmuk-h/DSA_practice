import java.util.*;
public class prob3{
    public static void main(String[] args) {
        //get size of array
        //get array as input
        //sort array


        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }

        //we got our array in non sorted manner now what
        //we will sort it by using for loop first
        int temp;
        /*for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }

        */

       int low = 0, high = size-1, mid = 0;
       while(mid<=high){
        if(array[mid] == 0){
            temp = array[mid];
            array[mid] = array[low];
            array[low] = temp; 
            low++;
            mid++;
        }else if(array[mid] == 1){
            mid++; 
        }else if(array[mid] == 2){
            temp = array[mid];
            array[mid] = array[high];
            array[high] = temp;
            high--;
            
        }
            
       }
       for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
       }
    }
}