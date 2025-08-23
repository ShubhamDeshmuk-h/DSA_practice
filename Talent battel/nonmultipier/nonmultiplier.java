import java.util.*;

//question is to we get size of an array from user
//user puts input of the array then we go to array check for the input

// 1st to last and send to 1st third to 2nd

public class nonmultiplier{
    public static void main(String[] arg){
        Scanner obj = new Scanner(System.in);

        // getting input from the user for array size
        int size = obj.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = obj.nextInt();
        }

        for(int i = 0; i<size; i++){
            if(array[i]%10 != 0){
                System.out.print(array[i] + " ");
            }
        }

        for(int i = 0; i<size; i++){
            if(array[i]%10 == 0){
                System.out.print(array[i]+ " ");
            }
        }
    }
}