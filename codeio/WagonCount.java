package codeio;

public class WagonCount {
    /*
     * v-vehicles=200
     * w-wheels=540
     * x+y=v
     * 2x+4y=w 2x+4(v-x)=w =>2x+4v-4x=w =>x=(4v-w)/2
     * y=v-x
     */
    public static void main(String[] args) {
        int v=200,w=540;
        WagonCount(v,w);
        
    }

    private static void WagonCount(int v, int w) {
        if((w<2)||(w%2!=0)){
            System.out.println("invalid input");
            return;
        }
        int x=(4*v-w)/2;
        int y=v-x;
        System.out.println(x+" "+y);
        
        
    }
    
}
