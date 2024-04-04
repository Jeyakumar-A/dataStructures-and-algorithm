public class Problem16 {
    public static void main(String[] args) {
        
        int x=10,y=7;
        int z=fun(y,x);
        System.out.println(z);
        
    }

    private static int fun(int a, int b) {
        if(b==0){
            return 0;
        }
        if(b%2==0){
            return fun(a+a,b/2);
        }
        return fun(a+a,b/2)+a;

    }

    
    
}
