public class Main{
    public static void main(String[] args) {
        int x = 11211;
        String s = Integer.toString(x);
        System.out.println(s.charAt(1));
        int i = 0;
        int j = s.length()-1;
        int count = 0;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                count++;
            }
            i++;
            j--;
        }
            if(count == s.length()/2){
                System.out.print("true");
            }
        }
        if(s.length()%2 == 1){
            if(count == s.length()/2){
                System.out.print("true");
            }
        }
        System.out.print("flase");
    }
}

