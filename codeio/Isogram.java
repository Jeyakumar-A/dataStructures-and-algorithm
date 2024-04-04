package codeio;

import java.util.HashMap;

public class Isogram {
    public static void main(String[] args) {
        String s="machine";
        System.out.println(isIsogram(s));
    }

    private static boolean isIsogram(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                return false;
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        return true;
    }
    
}
