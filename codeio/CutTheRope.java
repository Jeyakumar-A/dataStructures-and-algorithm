package codeio;

import java.util.ArrayList;
import java.util.Arrays;

public class CutTheRope {
    public static void main(String[] args) {
        int arr[]={5,1,1,2,3,5};
        System.out.println(ropeCutting(arr,arr.length));
    }

    private static ArrayList<Integer> ropeCutting(int[] arr, int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        Arrays.sort(arr);
        int cuttinglength=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-cuttinglength>0){
                ans.add(n-i);
                cuttinglength=arr[i];
            }
        }

        return ans;
    }
    
}
