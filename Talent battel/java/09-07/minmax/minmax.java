import java.util.*;
public class minmax{
    public static void main(String[] args){

        Scanner obj = new Scanner(System.in);

        int size = obj.nextInt();

        int[] array = new int[size];

        for(int i = 0; i<size;i++){

            array[i] = obj.nextInt();
        }

        int maxx = array[1];

        for(int i = 0; i<size;i++){
            
            if(maxx < array[i]){
                maxx  = array[i];
            }
        }

        System.out.println(maxx);
        
        int minn = array[1];

        for(int i = 0; i<size;i++){
            
            if(minn > array[i]){
                minn  = array[i];
            }
        }
        
        System.out.print(minn);

        
    }
}