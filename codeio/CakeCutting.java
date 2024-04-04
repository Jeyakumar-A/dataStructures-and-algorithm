package codeio;

public class CakeCutting {
    /*S=2+4+7+11....
     * Sn+1=2+4+7+11+.....+(n-1)
     * Tn=Sn-Sn-1
     * 2+(4-2)+(7-4)+(11-7)
     * 2+2+3+4+5+....+n
     * 1+(1+2+3+4+....+n)
     * 1+n(n+1)/2
     */
    public static void main(String[] args) {
        int n=11;
        System.out.println(maximumCuts(n));
        
    }

    private static int maximumCuts(int n) {
        return (1+n*(n+1)/2);
    }
    
}
