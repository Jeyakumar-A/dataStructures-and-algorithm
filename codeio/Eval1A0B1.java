package codeio;

public class Eval1A0B1 {
    public static void main(String[] args) {
        String str="1C0C1C1A0B1";
        System.out.println(eval(str));
    }


    private static int eval(String str) {
        int n=str.length();
        char[] ch=str.toCharArray();
        int ans=(int)ch[0]-48;
        for(int i=1;i<n-1;i++){
            if(ch[i]=='A'){
                int temp=(int)ch[i+1]-48;
                ans=ans&temp;
                
            }
            else if(ch[i]=='B'){
                int temp=(int)ch[i+1]-48;
                ans=ans|ch[i];
            }
            else{
                int temp=(int)ch[i+1]-48;
                ans=ans^ch[i];
            }
        }
        return ans;
    }
    
}
