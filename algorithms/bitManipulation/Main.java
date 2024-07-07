package bitManipulation;

public class Main {
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
        System.out.println(hammingWeight(n));
    
    }
    private static int hammingWeight(int n) {
        // TODO Auto-generated method stub
        int ones=0;
        for(int i=0;i<=32;i++){
            ones+=n&1;
            n=n>>1;
        }
        return ones;
    }
}
