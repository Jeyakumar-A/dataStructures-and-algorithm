

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        String str="";
        int ans=0;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            ans+=str.charAt(i)-96;
        }
        System.out.println(ans);
        
        
    }
}
