public class Main{
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
        
        //let's check 
        
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        if(strs.length == 0){
            return "";
        }
        if(strs.lenght == 1){
            return strs[1];
        }
        int len = strs.length;
        for (int i = 0; i < Math.max(strs[0].length(), strs[len-1].length()); i++) {
            if(strs[1].charAt(i) == strs[len-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else{
                break;
            }
            
        }
        return sb.toString();
    }
}

//this is leet code solution
/*class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }

        int wordcount = 0; 
        StringBuilder outputstring = new StringBuilder();
        while(true){
            int counttocheck = 0;
            for (int i = 0; i < strs.length-1; i++) {
                if(wordcount < strs[i].length() && wordcount < strs[i+1].length() &&
                    strs[i].charAt(wordcount) == strs[i+1].charAt(wordcount)){
                    counttocheck++;
                }else{;
                    return outputstring.toString();

                }
            }
            if(counttocheck == strs.length-1){
                outputstring.append(strs[0].charAt(wordcount));
                wordcount++;
            }
        }
    }
}*/