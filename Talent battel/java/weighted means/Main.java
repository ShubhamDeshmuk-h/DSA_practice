//this is old problem where you can only more right and down so we
//east west left right
//south north down up
//from top left corner to right bottom corner
import java.util.*;
public class Main{
    public static void display(int[][] matrix){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] weights_of_block = new int[3][3];
        int[][] given_matrix = new int[3][3];
        int length_of_matrix = 3+2;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                weights_of_block[i][j] = obj.nextInt();
            }
        }
        //display(given_matrix);
        display(weights_of_block);
        //we have to travese 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                given_matrix[i][j] = 0;
            }
        }
        given_matrix[0][0] = weights_of_block[0][0];
        int m = 0;



        for (int i = 1; i < 3; i++) {
            given_matrix[m][i] = Math.max(weights_of_block[m][i-1],weights_of_block[m][i]);
        }

        for (int i = 1; i < 3; i++) {
            given_matrix[i][m] = Math.max(weights_of_block[i-1][m],weights_of_block[i][m]);
        }
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                int x = Math.min(weights_of_block[i][j-1],weights_of_block[i-1][j]);
                given_matrix[i][j] = Math.max(weights_of_block[i][j], x);
            }
            
        }
        given_matrix[3-1][3-1] = Math.min(given_matrix[2][1], given_matrix[1][2]);

        display(given_matrix);
    }
}