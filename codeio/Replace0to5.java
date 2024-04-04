package codeio;

public class Replace0to5 {
    public static void main(String[] args) {
       int n=1004;
    int ans=convertFive(n);
    System.out.println(ans);  
    }

    private static int convertFive(int n) {
        int ans=0;
        if(n==0){
            return 5;
        }
        int factor=1;
        while(n>0){
            if(n%10==0){
                ans+=5*factor;
            }
            else{
                ans+=(n%10)*factor;
            }
            n=n/10;
            factor=factor*10;
        }
        return ans;
    }
   
    
}
