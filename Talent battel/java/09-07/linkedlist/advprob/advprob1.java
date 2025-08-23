import java.util.*;


public class advprob1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //r1 rupees per hr for the first n hours and then r2 rupees per hr
        //find total travelling cost in rupees
        //min into sec ceiling value should be total no of hr
        //if traveling time is 90 min ie 1.5 hr it must be considered as 2hr
        //example input 20 --r1 4 -- n 40 --r2 300 --x output is 120
        //30 5 35 500 output 290

        int r1 = obj.nextInt();
        int n = obj.nextInt();
        int r2 = obj.nextInt();
        int x = obj.nextInt();
        int totalcost = 0;

        int halfcost = 0;
        int otherhalf = 0;

        halfcost = r1*n;
        
        int remainingtime = x - (n*60);
        if (remainingtime%60 > 0){
            remainingtime += 60-remainingtime%60;
        }

        int time = remainingtime/60;

        otherhalf = r2*time;
        

        //8.2 => 9
        //8.8 => 9

        totalcost = halfcost + otherhalf;
        System.out.print(totalcost);
        obj.close();
    }
}