import java.util.Arrays;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of questions: ");
        int size = s.nextInt();
        int phy[] = new int[size];
        int maths[] = new int[size];
        int chem[] = new int[size];

        System.out.print("Enter i : ");
        int ith = s.nextInt();
        
        System.out.print("Enter q : ");
        int qth = s.nextInt();
        
        System.out.print("Physics: ");
        for(int  i = 0; i < size; i++){
            phy[i] = s.nextInt();
        }
        Arrays.sort(phy);
        System.out.print("Maths: ");
        for(int  i = 0; i < size; i++){
            maths[i] = s.nextInt();
        }
        Arrays.sort(maths);
        System.out.print("Chemistry: ");
        for(int  i = 0; i < size; i++){
            chem[i] = s.nextInt();
        }
        Arrays.sort(chem);
        
        int q1 = phy[ith -1] + chem[ith -1] + maths[ith -1] ;
        System.out.println(q1);

        if(qth != size-1 ){
            System.out.println(-1);
        }
        else{
            int q2 = phy[qth -1] + chem[qth -1] + maths[qth -1];
             System.out.println(q2);
        }


    }
}