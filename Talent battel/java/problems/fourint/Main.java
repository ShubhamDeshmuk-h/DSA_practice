import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if(arr[i]%3 == 0 ){
                if(arr[i]%3==0 && arr[i]%5==0){
                    System.out.print("THREEFIVE"+" ");
                }else{
                    System.out.print("THREE"+" ");
                }
                }else{ 
                if(arr[i]%5 == 0){
                    System.out.print("FIVE"+" ");

                }else{
                    System.out.print(arr[i]+" ");
            }

            }
        }
    }
}