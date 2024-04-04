import java.util.Scanner;

public class RemPalin {
    public static boolean ispalindrome(String word){
        int n=word.length();
        for(int i=0;i<=n/2;i++){
            if(word.charAt(i)!=word.charAt((n-1)-i))
            return false;
        }
        return true;
    }
    public static String removepalindrome(String str)
    {
        String word="";
        String finalstr="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                word=word+str.charAt(i);
            }
            else
            {
            if(!(ispalindrome(word))){
            finalstr=word+" ";
           
            }
         }
        }



    return finalstr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       System.out.println(removepalindrome(str));
    }
    
}
