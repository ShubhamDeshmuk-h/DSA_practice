import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        //get number of pipe as input and then rate capacity
        //input
        int size_input_pipe = obj.nextInt();
        int[] input_pipe = new int[size_input_pipe];
        int size_output_pipe = obj.nextInt();
        int[] output_pipe = new int[size_output_pipe];
        int rust_factor = obj.nextInt();
        
        for (int i = 0; i < size_input_pipe; i++) {
            input_pipe[i] = obj.nextInt();
        }
        for (int i = 0; i < size_output_pipe; i++) {
            output_pipe[i] = obj.nextInt();
        }
        int sum_input = 0;
        for (int i = 0; i < size_input_pipe; i++) {
            sum_input += (input_pipe[i]-rust_factor);
        }
        int sum_output =0;
        for (int i = 0; i < size_output_pipe; i++) {
            sum_output += (output_pipe[i] - rust_factor);
        }
        System.out.println(sum_input+" "+sum_output);
        int sum = sum_input-sum_output;
        if((sum) == 0){
            System.out.println("Balanced");
        }else{
            if(sum_input>sum_output){
                System.out.println("-"+(sum+rust_factor));
            }else{
                System.out.println(sum-rust_factor);
            }
        }
    }
}