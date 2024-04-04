package codeio;

import java.util.HashSet;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={8,2,6,1};
        int count=numberOfElements(a,a.length,b,b.length);
        System.out.println(count);
    }

    private static int numberOfElements(int[] a, int m, int[] b, int n) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<m;i++){
            set.add(a[i]);
        }
        for(int i=0;i<n;i++){
            if(set.contains(b[i])){
                count++;
            }
        }
        return count;
    }

    
}
