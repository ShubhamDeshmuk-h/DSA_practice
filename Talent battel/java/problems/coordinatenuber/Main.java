import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt();
        int n = obj.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = obj.nextInt();
            }
            
        }
        int x = obj.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == x){
                    System.out.println("("+i+","+j+")");
                }
            }
            
        }
    }
}