package codeio;

public class ReciprocalString {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(reciprocalSttring(s));
    }

    private static String reciprocalSttring(String s) {
        
        String ans="";
        int dis=0;
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isUpperCase(s.charAt(i))){
                    dis=(int)s.charAt(i)-65;
                    ans+=(char)(90-dis);
                }
                else{
                     dis=(int)s.charAt(i)-97;
                    ans+=(char)(122-dis);
                }
            }else{
                ans+=s.charAt(i);
            }

            }
        
        return ans;
    }
    
}
