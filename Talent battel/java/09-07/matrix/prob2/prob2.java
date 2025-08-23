import java.util.*;
//diagonal addition 11,22,33 and 02,11,20
    //now diagonal element increase by next 1+i,1+i and here alternt 0+i,n-i
    //using for loop for the getting input 
    //input then get process for diagonal element 
    //need two variables sum1 sum2 net sum
    //for with i<row i = 1
    //sum1 = sum1 + matrix[0+i][0+i] sum2 = sum2 + matrix[row-1][row -i] 
public class prob2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int row = obj.nextInt();
        int column = obj.nextInt();
        int[][] matrix = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = obj.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<row ;i++){
            sum1 = sum1 + (matrix[i][i]);
        }
        for(int i=0; i<row ;i++){
            sum2 = sum2 + (matrix[i][row-1-i]);
        }
        System.out.println(sum1);
        System.out.println(sum2);

        int totalsum = sum2-sum1;
        System.out.println(Math.abs(totalsum));
        obj.close();
    }
    
        
}