//we are going to get array as input then 
//sort that array sorting will help us to gain more visuals
//get size then get input of the 
import java.util.*;
public class prob4{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = obj.nextInt();
        }
        System.out.print("Enter the index of element you want: ");
        int kthelement = obj.nextInt();
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if(array[i]<array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");
       }
        System.out.println("Element at" + kthelement + "Index is: " +  array[kthelement]);

    }
}