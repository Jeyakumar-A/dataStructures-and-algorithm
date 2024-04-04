import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        int n,i,sum=0;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    for(i=0;i<n;i+=2){
        sum=a[i]+a[i+1];
        System.out.println(sum);
        sum=0;

    } 
    }
   
    
    
}
