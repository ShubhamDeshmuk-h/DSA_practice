public class Main{
    public void maxelement(int[] nums , int k){
            for (int i = 0; i < nums.length; i++) {
                int max = 0;
                int j =0;
                while(j<k){
                    max = Math.max(max,nums[i+j]);
                    j++;
                }
                System.out.println(max);
            }

    }       
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        Main s = new Main();
        int k = 3;
        s.maxelement(nums, k);
        
        

    }
}