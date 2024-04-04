package codeio;

public class Encode {
    public static void main(String[] args) {
        String s1="abbac";
        String ans=encode(s1);
        System.out.println(ans);
    }

    private static String encode(String s1) {
        int count=1;
        String ans="";
        for(int i=1;i<s1.length();i++){
            if(s1.charAt(i-1)!=s1.charAt(i)){
                ans=ans+s1.charAt(i-1);
                ans=ans+String.valueOf(count);
                count=1;
            }
            else{
                count++;
            
            }
        }
            ans=ans+s1.charAt(s1.length()-1);
            ans=ans+String.valueOf(count);
        
        return ans;
    }
    
}
