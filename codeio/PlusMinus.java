package codeio;

public class PlusMinus {
    public static void main(String[] args) {
        int arr[]={1,1,0,-2,-5};
        plusMinus(arr);
    }

    private static void plusMinus(int[] arr) {
        double poscount=0;
        double negcount=0;
        double zerocount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                poscount++;
            }
            else if(arr[i]<0){
                negcount++;
            }
            else{
                zerocount++;
            }
        }
        double posRatio=poscount/n;
        double negRatio=negcount/n;
        double zeroRatio=zerocount/n;
        System.out.printf("posRatio: %,.6f",posRatio);
        System.out.println();
        System.out.printf("negRatio: %,.6f",negRatio);
        System.out.println();
        System.out.printf("zeroRatio: %,.6f",zeroRatio);

    }
    
}
