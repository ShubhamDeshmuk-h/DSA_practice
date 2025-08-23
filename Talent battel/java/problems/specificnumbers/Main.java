import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the l:");
        int l = obj.nextInt();
        System.out.println("Enter the U:");
        int u = obj.nextInt();
        int counter = 0;
        boolean flag = false;
        for(int i = l; i<=u;i++){
            int val = i;
            while(val>0){
                if( val%10 == 1 || val%10 == 4 || val%10 == 9){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
                val = val/10;
            }
            if(flag == true){
                counter++;
            }


            
        }
        System.out.println("Occurance of x from i to u is:"+counter);
    
    }
}