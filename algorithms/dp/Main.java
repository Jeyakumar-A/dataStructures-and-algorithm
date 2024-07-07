package dp;

public class Main {
    public static void main(String[] args) {
        int n=4;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        // TODO Auto-generated method stub
        int dp[]=new int[n+1];
         dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    
}
