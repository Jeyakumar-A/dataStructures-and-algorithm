package recursionEasy;

public class Nto1 {
    public static void main(String[] args) {
        funboth(5);
    }

    private static void funboth(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    }
    
}
