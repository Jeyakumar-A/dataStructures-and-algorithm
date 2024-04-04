package set1to19.se1;

public class PrintTheWordOddLett {
    public static void main(String[] args) {
        String s="programm";
        int len=s.length();
        pattern(s,len);
        
        
    }

    private static void pattern(String s, int len) {
        for(int i=0;i<len;i++){
            int j=len-1-i;
            for(int k=0;k<len;k++){
                if(k==i||k==j){
                    System.out.print(s.charAt(k));
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }


}
