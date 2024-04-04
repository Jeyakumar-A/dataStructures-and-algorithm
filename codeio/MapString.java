package codeio;

import java.util.HashMap;

public class MapString {
    public static void main(String[] args) {
        String s1="add";
        String s2="egg";
        boolean result1=mapString(s1,s2);
        boolean result2=mapString(s2,s1);
        if(result1&&result2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }

    private static boolean mapString(String s1, String s2) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            if(!map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),s2.charAt(i));
            }
            else{
                if(map.get(s1.charAt(i))!=s2.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
    
}
