import java.util.*;
public class firstandlastletter{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String n = obj.nextLine();
        String up = n.toUpperCase();
        int len = up.length();
        System.out.println(up.charAt(0)+"."+up.charAt(len-1));
        
    }
}