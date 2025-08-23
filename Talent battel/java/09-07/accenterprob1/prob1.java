import java.util.*;
public class prob1{
    public static void main(String[] args) {
        //sum of even number in given list 
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] array = new int[size];
        for(int i = 0;i<size;i++){
            array[i] = obj.nextInt();
            }
    
        int sum = 0;
        for(int i=0; i<size ;i++){
            if(array[i]%2 == 0){
                sum = sum + array[i];
            }
            
        }
        System.out.println(sum);
        
    }
}

