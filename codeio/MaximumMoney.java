package codeio;

public class MaximumMoney {
    public static void main(String[] args) {
        int n=4;
        int k=100;
        int ans=maximumMoney(n,k);
        System.out.println(ans);
    }

    private static int maximumMoney(int n, int k) {
        if(n%2==0)
            return (n/2)+k;
        else
            return (n/2+1)+k;
        
    }
    
}
