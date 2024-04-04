package codeio;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n=1001;
        String ans=isPalindrome(n);
        System.out.println(ans);
    }

    private static String isPalindrome(int n) {
        int copy=n;
        int rev=0;
        while(n!=0){
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        if(rev==copy)
            return "yes";
        else
            return "no";
    }
    
}
