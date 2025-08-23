import java.util.*;
public class Main{
    public void sorting(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i-1; j++) {
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
    }
    public int majority(int[] nums){
        int count = 0;
        int candiate = 0;
        for(int n:nums){
            if(count == 0){
                candiate = n;
            }
            count +=(n==candiate) ? 1:-1;
            //increament count if n is equal to 
        }
        return candiate;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Main s = new Main();
        int size = obj.nextInt();

        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = obj.nextInt();
        }


        int[] count = new int[10];
        s.sorting(nums);
        int va = s.majority(nums);
        System.out.println("element:"+va);

    }
}