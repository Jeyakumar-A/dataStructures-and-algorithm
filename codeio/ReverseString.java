package codeio;

import java.util.HashMap;

public class ReverseString {
    public static void main(String[] args) {
        String s="GeeksforGeeks";
        String ans=reverseString(s);
        System.out.println(ans);
    }

    private static String reverseString(String s) {
        String answer="";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=s.length()-1;i>=0;i--){
            if(map.containsKey(s.charAt(i))){
                continue;
            }
            else{
                answer=answer+s.charAt(i);
                map.put(s.charAt(i),1);
            }
        }
        return answer;
    }
    
}
