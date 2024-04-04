package codeio;

public class DigitsAndOperators {
    public static void main(String[] args) {
        String s="67542-/+-";
        int first_op=0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                first_op=i;
                break;
            }
        }
            int ans=(int)s.charAt(0);
            int op=first_op;
        for(int i=1;i<first_op;i++){
            if(s.charAt(op)=='+'){
                ans+=(int)s.charAt(i);
            }
            else if(s.charAt(op)=='-'){
                ans-=(int)(s.charAt(i));
            }
             else if(s.charAt(op)=='*'){
                ans*=(int)(s.charAt(i));
            }
            else{
                 ans/=(int)(s.charAt(i));
            }
            op++;
        }
            System.out.println(ans);
        
    }
    
}
