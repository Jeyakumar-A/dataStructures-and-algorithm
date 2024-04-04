package codeio;

public class RedGreen {
    public static void main(String[] args) {
        String s="RGRGR";
        System.out.println(redOrGreen(s.length(),s));
    }

    private static int redOrGreen(int n, String s) {
        int redCount=0;
        int greenCount=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                redCount++;
            }
            else{
                greenCount++;
            }
        }
        return Math.min(redCount, greenCount);
    }
    
}
