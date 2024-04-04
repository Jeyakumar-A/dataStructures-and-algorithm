import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        int n,a[];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        n=sc.nextInt();
        
        a=new int[n];
        System.out.println("enter array value");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        pintnge(a,n);
    }

    private static void pintnge(int[] a, int n) {
        int next,i,j;
        for(i=0;i<n;i++){
            next=-1;
            for(j=i+1;j<n;j++){
                if(a[i]<a[j]){
                    next=a[j];
                    break;
                }
            }
            System.out.println(next);
        }
    }
    
}
