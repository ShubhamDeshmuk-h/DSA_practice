public class Main{
    public static int[] endzero(int[] arr){
        int i = 0;
        while(i<arr.length){
        int left = arr[i];
        int right = arr[i+0];
        if(left == 0 && right != 0){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,21,0,3,0};
        int[] result;
        Main s = new Main();
        result = s.endzero(arr);
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
        System.out.print("]");
    }
}