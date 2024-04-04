package codeio;

public class Formanumberdivby3 {
    /* 
     * 400059/3
    */
    public static void main(String[] args) {
        int a[]={40,50,90};
        int n=a.length;
        System.out.println(isPossible(n,a));
    }

    private static int isPossible(int n, int[] a) {
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i]%3;
        }
        if(sum%3==0){
            return 1;
        }
        return 0;
    }
    
}
