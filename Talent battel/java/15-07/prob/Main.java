import java.util.*;
public class Main{
    public int checksmallest(int val){
        int smallestval = val%10;
        for (int i = 0; i < 4; i++) {
            int modified_val = val%10; 
            if(modified_val<smallestval){
                smallestval = modified_val;
            }
            val = val/10;
        }
        return smallestval;
    }
    public int checklargest(int val){
        int largeval = val%10;
        for (int i = 0; i < 4; i++) {
            int modified_val = val%10;
            if(modified_val>=largeval){
                largeval = modified_val;
            }
            val = val/10;
        }
        return largeval;
    }
    public static void main(String[] args) {
        //we have number ranging from 1000 to 9999
        //key = sum of smallest digit of all 3 nujber - sum of largest digit of all 3 numbers
        Scanner obj = new Scanner(System.in);
        Main s = new Main();
        int input1 = obj.nextInt();
        int input2 = obj.nextInt();
        int input3 = obj.nextInt();
        int[] smallnumbers = new int[3];
        int[] largenumbers = new int[3];
        smallnumbers[0] = s.checksmallest(input1);
        smallnumbers[1] = s.checksmallest(input2);
        smallnumbers[2] = s.checksmallest(input3);
        //

        largenumbers[0] = s.checklargest(input1);
        largenumbers[1] = s.checklargest(input2);
        largenumbers[2] = s.checklargest(input3);
        for (int i = 0; i < 3; i++) {
            System.out.println(smallnumbers[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(largenumbers[i]);
        }
        int sumoflsmall = 0;
        for (int i = 0; i < 3; i++) {
            sumoflsmall += smallnumbers[i];
        }
        int sumoflarge = 0;
        for (int i = 0; i < 3; i++) {
            sumoflarge += largenumbers[i];
        }

        int result = sumoflsmall - sumoflarge;
        System.out.println(result);
    }
}