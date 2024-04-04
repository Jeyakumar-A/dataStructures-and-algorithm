package codeio;

public class CountSort {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        String ans=countSort(str);
        System.out.println(ans);
    }

    private static String countSort(String str) {
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){
            int temp=(int)str.charAt(i)-97;
            count[temp]++;
            
        }
        String ans="";
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                ans+=(char)(i+97);
            }
        }
        return ans;
    }
    
}
