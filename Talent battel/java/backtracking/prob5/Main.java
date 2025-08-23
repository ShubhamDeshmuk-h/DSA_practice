public class Main{
    static void backtrack(int k, String curr){
        if(curr.length() == k){
            System.out.print(curr+" ");
            return;
        }
        for(char c='1';c<='5';c++){
            backtrack(k, curr+c);
        } 
    }
    public static void main(String[] args) {
        //k is 
        //curr is
        int k = 2;
        Strin curr = ;
        backtrack(k,curr);

    }
}