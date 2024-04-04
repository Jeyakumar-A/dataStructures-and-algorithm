
import java.util.Scanner;

public class getMaxRepeatdLtr {
    
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        System.out.println(getMaximumRepeated(str));
    }

    private static String getMaximumRepeated(String str) {
        int count[]={0};
        int len=str.length();
        int max=0;
        String result="";
        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
            if(max<count[str.charAt(i)]){
                max=count[str.charAt(i)];
                result=String.valueOf(str.charAt(i));
            }
        }
        return String.valueOf(result);
        
    }
    
}
