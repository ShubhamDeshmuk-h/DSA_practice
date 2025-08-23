import java.util.*;
public class Main{
    public static void main(String[] args) {
        //we have threee questions
        //for job offer in DSA round 3 questions where asked and some of the were able to solve some
        //P1 is employees solved first, second
        //p2 second,third
        //p3 third, first
        //Q is who solved all
        //r is people who didn't participated
        //find how many solved first
        //find how many solved exactly one of the 3 problems
        //x is total participants or people
        //logic is total - didn't participage
        //val = total - P1+P2+P3+Q+R
        //solvedone = total/3
        //solvedone1 + P1 + P3 + Q


        //alladdition  = p1 p2 p3 Q r
        //formul = e-r+(2Q)-p1-p2-p3
        //formul/3
        

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value P1:");
        int P1 = obj.nextInt();
        System.out.println("Enter the value P2:");
        int P2 = obj.nextInt();
        System.out.println("Enter the value P3:");
        int P3 = obj.nextInt();
        System.out.println("Enter the value Q:");
        int Q = obj.nextInt();
        System.out.println("Enter the value R:");
        int R = obj.nextInt();
        System.out.println("Enter the value E:");
        int E = obj.nextInt();

        int addi = P1+P2+P3+Q+R;
        int val = E - addi;
        int sovledone1 = val/3;
        int solved_only_first = sovledone1 + P1 + P3;

        System.out.println("Employees who solved only one :" + solved_only_first);
        System.out.println("Solved only one by how many employees is:" + sovledone1);


    }
}