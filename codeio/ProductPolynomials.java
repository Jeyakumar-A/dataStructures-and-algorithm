package codeio;

import java.util.ArrayList;
import java.util.List;

public class ProductPolynomials {
   
    public static void main(String[] args) {
        int arr1[]={1,0,3,2};
        int arr2[]={2,0,4};
        int m=arr1.length;
        int n=arr2.length;
        List<Integer> ans=new ArrayList<>();
        ans=polyMultiply(arr1,arr2,m,n);
        System.out.println(ans);
        
    }

    private static ArrayList<Integer> polyMultiply(int[] arr1, int[] arr2, int m, int n) {
         int arr[]=new int[m+n-1];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i+j]+=arr1[i]*arr2[j];
            }
         }
         List<Integer> list=new ArrayList<>();
         for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
         }
        return  (ArrayList<Integer>) list;
    }
    
}
