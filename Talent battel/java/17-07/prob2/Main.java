public class Main{
    public static void main(String[] args) {
        /*int[] arr = {};
        int window_size = 2;
        int maxele = 0;
        int current_sum = arr[0]+arr[1];
        for(int i=1;i<arr.length-1;i++){
            int window_sum = current_sum;
            current_sum = (current_sum-arr[i])+arr[i+1];
            if(maxele<current_sum){
                maxele = current_sum-1;
            }

        }
        System.out.println(maxele);*/
        int[] arr = {5, 2, 4, 6, 3, 1};
        int k = 2;
        int maxsum = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxsum = Math.max(maxsum, sum);
        }

        System.out.println("Result = " + (maxsum));
    }
}