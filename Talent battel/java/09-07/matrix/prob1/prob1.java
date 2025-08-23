import java.util.*;
public class prob1{
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
    }
}