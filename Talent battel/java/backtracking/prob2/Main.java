public class Main{
    static int[][] result = new int[100][];
    static int resultindex=0;
    public static void genreratesubset(int[] nums){
        int[] temp = new int[nums.length];
        backtrack(nums,0,temp,0);
        printout();
    }
    public static void backtrack(int[] nums, int index, int[] temp, int tempsize){
        result[resultindex]=new int[tempsize];
        for (int i = 0; i < tempsize; i++) {
            result[resultindex][i] = temp[i];
        }
        resultindex++;
        for (int i = index; i < nums.length; i++) {
            temp[tempsize] = nums[i];
            backtrack(nums, i+1, temp, tempsize);
        }
    }
    private static void printout(){
        System.out.print("[");
        for (int i = 0; i < resultindex; i++) {
            System.out.print()
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        
    }
}