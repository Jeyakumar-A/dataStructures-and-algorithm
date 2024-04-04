package codeio;

public class GeekForgetTheCode {
    public static void main(String[] args) {
        int numberofdigits=5;
        int sum=12;
        System.out.println(largestNumber(numberofdigits,sum));
    }

    private static String largestNumber(int n, int sum) {
        String s="";
        if(9*n<sum){
            return "-1";
        }
        while(sum>0){
            if(sum>=9){
                s=s+"9";
                sum-=9;
            }
            else{
                s+=String.valueOf(sum);
                sum=0;
                break;
            }
        }
        for(int i=s.length();i<n;i++){
            s+="0";
        }

        return s;
    }
    
}
