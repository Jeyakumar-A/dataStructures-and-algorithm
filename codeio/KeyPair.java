package codeio;

import java.util.HashMap;
import java.util.Map;

public class KeyPair {
    public static void main(String[] args) {
        int[] arr={1,4,45,6,10,8};
        int n=arr.length;
        boolean ans=hasArrayTwoCandidates(arr,n,13);
        System.out.println(ans);
    }

    private static boolean hasArrayTwoCandidates(int[] arr, int n, int x) {
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<n;i++){
            s.put(arr[i],0);
        }
        for(int i=0;i<n;i++){
            if(s.containsKey(x-arr[i])){
                return true;
            }
        }

        return false;
    }
    
}
