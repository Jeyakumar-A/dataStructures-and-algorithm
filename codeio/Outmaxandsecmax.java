package codeio;

import java.util.ArrayList;
import java.util.Collections;

public class Outmaxandsecmax {
    public static void main(String[] args) {
        int[] arr={2,8,7,1,5};
        System.out.println(findElements(arr,arr.length));
    }

    private static ArrayList<Integer> findElements(int[] arr, int n) {
        int max=0;
        int smax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax){
                smax=arr[i];
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==max||arr[i]==smax){
                continue;
            }
            ans.add(arr[i]);
        }
        Collections.sort(ans);
        return ans;
    }
    
}
