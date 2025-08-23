
import java.awt.font.NumericShaper;

//integer array num
//array a array b
//average(a) and average of b are requal 
//return true false otherwise 
public class Main{
    private boolean backtrack(int index,int, sumA, int sumB, int countA, int sumB, int countB){
        if(countA!=0 && countB!=0 && sumA*countB == sumB*countA){
            return true;
        }
        if(index == nums.length){
            return false;
        }
    }
    public static void main(String[] args) {
        
    }
}