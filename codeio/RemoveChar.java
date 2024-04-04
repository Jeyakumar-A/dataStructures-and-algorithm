package codeio;

public class RemoveChar {

    public static void main(String[] args) {
        String s1="computer";
        String s2="cat";
        String ans=removeChar(s1,s2);
        System.out.println(ans);
    }

    private static String removeChar(String s1, String s2) {
        int arr[]=new int[26];
        int index;
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<n;i++){
            index=(int)s2.charAt(i)-97;
            arr[index]++;
        }
        String copy="";
        for(int i=0;i<m;i++){
            index=(int)s1.charAt(i)-97;
            if(arr[index]==0){
                copy+=s1.charAt(i);
            }
        }
        return copy;
    }
}
