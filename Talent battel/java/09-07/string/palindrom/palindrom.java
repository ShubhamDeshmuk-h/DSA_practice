import java.util.Scanner;
/*
public class palindrom {

    public static int isplindrom(char[] str, int len)  {
        int left = 0;
        int right = len - 1;
        int val = 0;

        for(int i = 0; i < len / 2; i++) {
            if(str[left] == str[right]) {
                left++;
                right--;
                val++;
            } else {
                return 0;
            }
        }

        if(val == len / 2) {
            return 1;
        }

        return 0; // safe fallback return
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = obj.nextLine();
        char[] str2 = str.toCharArray();

        System.out.print("Enter the length of the string: ");
        int len = obj.nextInt();

        int result = isplindrom(str2, len);

        if(result == 1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
*/


//sirs code

public class palindrom{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char[] str2 = str.toCharArray();
        int len = obj.nextInt();
        int val = pal(str2,len);
        System.out.println(val);

        
    }
    public static int pal(char[] str,int len){
        int left = 0;
        int right = len-1;
        while(left<=right){
            if(str[left] == str[right]){
                left++;
                right--;
                
            }
            else{
                return 0;

            }
        }
    
    
        return 1;
    }
}