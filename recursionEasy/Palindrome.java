package recursionEasy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(123));
    }

    private static boolean palin(int n) {
        return n==rev(n);
    }

    private static int rev(int n) {
       int sum=0;
        while(n!=0){
        int rem=n%10;
        sum=sum*10+rem;
        n=n/10;
        }
        return sum;
    }
    
}
