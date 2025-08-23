
/*
import java.util.*;
public class prob3{


    //public class int rec(matrix){


    //}
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //import Scanner then create obj for input
        //create matrix object and then get input of col and row
        //create matrix and print it with the help of nested for loop

        //after create 4 variable one i and other t
        //problem was we have matrix 

        // get 4 variables and all will get small

        int row = obj.nextInt();
        int col = obj.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                matrix[i][j] = obj.nextInt();
            }
            
        }

        for(int i = 0;i<col;i++){
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();

        }

        //for variables of all sides
        int upperside = 0;
        int rightside = 0;
        int lowerside = row - 2;
        int leftside = col - 1;
        int loopval = col;
        



        //to set condition of total printed number
        int totalprinted = 0;




        while(totalprinted != row*col){

            for (int i = 0; i < loopval; i++) {
                System.out.print(matrix[rightside][upperside]+" ");
                upperside = upperside + 1;
                totalprinted++;
            }

            rightside = rightside+1;
            upperside = upperside-1;
            loopval = loopval-1;

            for (int i = 0; i < loopval; i++) {
                
                System.out.print(matrix[rightside][upperside]+" ");
                rightside++;
                totalprinted++;
            }

            rightside = rightside-1;

            for (int i = 0; i < loopval; i++) {
                System.out.print(matrix[leftside][lowerside]+" ");
                lowerside--;
                totalprinted++;
            
            }
            lowerside = lowerside+1;
            leftside = leftside -1;
            loopval = loopval-1;

            for (int i = 0; i < loopval; i++) {
                System.out.print(matrix[leftside][lowerside]+" ");
                leftside--;
                totalprinted++;
            
            }

            upperside = upperside -2;
            rightside = rightside -2;
            leftside = leftside + 1;
            lowerside = lowerside + 1;
        }
    }
}
*/

import java.util.*;

public class prob3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Input number of rows and columns
        int row = obj.nextInt();
        int col = obj.nextInt();

        int[][] matrix = new int[row][col];

        // Input matrix elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Spiral print
        System.out.println("\nSpiral Order:");
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = col - 1;

        int totalPrinted = 0;
        int totalElements = row * col;

        while (totalPrinted < totalElements) {
            // Move left to right
            for (int i = left; i <= right && totalPrinted < totalElements; i++) {
                System.out.print(matrix[top][i] + " ");
                totalPrinted++;
            }
            top++;

            // Move top to bottom
            for (int i = top; i <= bottom && totalPrinted < totalElements; i++) {
                System.out.print(matrix[i][right] + " ");
                totalPrinted++;
            }
            right--;

            // Move right to left
            for (int i = right; i >= left && totalPrinted < totalElements; i--) {
                System.out.print(matrix[bottom][i] + " ");
                totalPrinted++;
            }
            bottom--;

            // Move bottom to top
            for (int i = bottom; i >= top && totalPrinted < totalElements; i--) {
                System.out.print(matrix[i][left] + " ");
                totalPrinted++;
            }
            left++;
        }
    }
}
