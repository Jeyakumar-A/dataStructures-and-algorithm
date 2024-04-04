package codeio;

import java.util.HashMap;
import java.util.Set;

public class Anagram {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="forgeeksgeeks";
        boolean ans=isAnagram(s1,s2);
        System.out.println(ans);
    }

    private static boolean isAnagram(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i),1);
            }
            
        }
        for(int i=0;i<s2.length();i++){
             if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i),map.get(s2.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        Set<Character> keys=map.keySet();
        for(Character key:keys){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
    
}
