package codeio;

public class GapSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        int gap=3;
        for(int i=0;i<gap;i++){
            int sum=0;
            for(int j=i;j<n;j+=gap){
                sum+=arr[j];
            }
            System.out.println(sum);
        }
    }
}
