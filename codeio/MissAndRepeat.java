package codeio;

public class MissAndRepeat {
    public static void main(String[] args) {
        int[] arr={2,2,1,4,4,3};
        int n=arr.length;
        missRepeat(arr,n);
    }

    private static void missRepeat(int[] arr, int n) {
        int[] count=new int[n];
        int repeat=0;
        for(int i=0;i<n;i++){
            if(count[arr[i]-1]==1){
                repeat=arr[i];
            }
            count[arr[i]-1]=1;
        }
        int miss=0;
        for(int i=0;i<n;i++){
            if(count[i]==0){
                miss=i+1;
            }
        }
        System.out.println("missed number"+miss);
        System.out.println("repeated number"+repeat);

    }
    
}
