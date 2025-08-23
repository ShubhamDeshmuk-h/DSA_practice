
import java.util.*;
public class Main{
    public boolean  ishappy(int num){
        Set<Integer> seen = new HashSet<>();
        while(num !=1 && !seen.contains(num)){
            seen.add(num);
            int square_addition = 0;
            while(num != 0){
                square_addition += Math.pow((num%10),2);
                num /= 10;
            }
            num = square_addition;
        }
        return num == 1;
    }
    public static void main(String[] args) {
        Main s = new Main();
        int n = 24;
        if (s.ishappy(n)) {
            System.out.println(n + " is a happy number.");
        } else {
            System.out.println(n + " is not a happy number.");
        }
        
        
    }
}