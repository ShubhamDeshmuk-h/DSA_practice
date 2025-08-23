import java.util.*;
public class Main{
    public static void display(int m,int n,int[][] matrix){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void checksubstring(String[] array1,String[] array2,int[][] matrix){
        int m = array1.length;
        int n = array2.length;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(array1[i-1] != array2[j-1]){
                    matrix[i][j] = Math.max(matrix[i][j-1],matrix[i][j]);
                }else{
                    matrix[i][j] = matrix[i-1][j-1]+1;
                }
            }
            
        }
        System.out.println(m+" "+n);
    }
    public static void main(String[] args) {
        //we have two sub string
        //for now we will take static then go for the dynamic
        //we have to draw an array
        //check 
        Main s = new Main();
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int[][] matrix = new int[m+1][n+1];
        s.display(m,n,matrix);
        String[] array1 = new String[m];
        for (int i = 0; i < m; i++) {
            array1[i] = obj.nextLine();
        }
        String[] array2 = new String[m];
        for (int i = 0; i < n; i++) {
            array2[i] = obj.nextLine();
        }
        
        }
}