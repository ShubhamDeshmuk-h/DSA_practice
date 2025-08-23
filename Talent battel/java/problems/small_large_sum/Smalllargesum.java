import java.util.*;
public class Smalllargesum{
    public int[] odd_array_sep(int[] arr){
        int n = arr.length;
        int sep_size = (n/2)+1;
        int count = 0;
        int[] separatearr_odd = new int[sep_size];
        for (int i = 0; i < n; i++) {
            if(i%2==1){
                separatearr_odd[count] = arr[i];
                count++;
            }
        }
        return separatearr_odd;
    }
    public int[] even_array_sep(int[] arr){
        int n = arr.length;
        int sep_size = (n/2)+1;
        int count = 0;
        int[] separatearr_even = new int[sep_size];
        for (int i = 0; i < n; i++) {
            if(i%2 == 0){
                separatearr_even[count] = arr[i];
                count++;
            }
        }
        return separatearr_even;
    }
    public void display(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public void sorting(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        
    }

    public static void main(String args[]){
        //we get array from user which is then used for the geting second largest element of odd and even position element 
        //and sum of those numbers is displayed
        //we have got two elements
        Scanner obj = new Scanner(System.in);
        Smalllargesum s = new Smalllargesum();
        int size  = obj.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        s.display(arr);
        int sep_size = (size/2)+1;
        
        int[] separatearr_even = new int[sep_size];
        int[] separatearr_odd = new int[sep_size];
        separatearr_even = s.even_array_sep(arr);
        separatearr_odd = s.odd_array_sep(arr);
        s.sorting(separatearr_even);
        s.sorting(separatearr_odd);
        s.display(separatearr_even);
        s.display(separatearr_odd);

        int firstele = separatearr_even[1];
        int secondele = separatearr_odd[1];
        int sum = firstele +secondele;
        System.out.println("Sum of the second largest element is:"+sum);
        obj.close();

    }
}