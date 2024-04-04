package aug2022;

public class Reversevowels {
    public static void main(String[] args) {
        String str=" I Worked in Zoho";
        System.out.println(reverseVowels(str));


    }
    public static String reverseVowels(String s){

        int n=s.length();
        int start=0;
        int end=n-1;
        char[] ch=s.toCharArray();
        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }
            else if(!isVowel(ch[end])){
                end--;
            }
            else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;
            }
        }

        return String.valueOf(ch);

    }
    private static boolean isVowel(char c) {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='a'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }
    
}
