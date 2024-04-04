package recursionEasy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans=prod(505);
        System.out.println(ans);
    }

    private static int prod(int n) {
        if(n%10==0){
            return 0;
        }
        return (n%10)*prod(n/10);
    }
}
