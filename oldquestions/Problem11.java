import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        s=sc.nextLine();
        int length=s.length();
        for(int i=length-1;i>=0;i--){
            if(isVowel(s.charAt(i))){
                System.out.println(s.charAt(i));
            }

        }

    }

    private static boolean isVowel(char ch) {
        
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    
}
