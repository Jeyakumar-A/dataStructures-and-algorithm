package codeio;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int ans=removeDuplicates(a,n);
        System.out.println(ans);

    }

    private static int removeDuplicates(int[] a, int n) {
        int j=0;
        for(int i=1;i<n;i++){
            if(a[i]!=a[j]){
                j++;
                a[j]=a[i];
            }
        }
        return j+1;
    }
    
}
