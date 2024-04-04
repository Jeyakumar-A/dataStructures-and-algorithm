package codeio;

import java.util.HashMap;


public class NonRepeatingChar {
    public static void main(String[] args) {
        String s="zxvczbtxyzvy";
        char ans=nonrepeatingChar(s);
        System.out.println(ans);
    }

    private static char nonrepeatingChar(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return '1';
    }
    
}
