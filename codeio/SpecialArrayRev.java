package codeio;



public class SpecialArrayRev {
    public static void main(String[] args) {
        String s="A&X#";
        System.out.println(reverse(s));
    }

    private static String reverse(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(!Character.isAlphabetic(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(s.charAt(j))){
                j--;
                continue;
            }
            else{
                s=swap(s,i,j);
                i++;
                j--;
            }
        }
        return s;
    }

    private static String swap(String s, int i, int j) {
        char[] ch=s.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        
        return String.valueOf(ch);
    }

   
    
}
