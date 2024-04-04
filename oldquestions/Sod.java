
import java.util.Scanner;

class Sod{
    public static void main(String[] args) {
        int n,sum=0;
        try (Scanner sc = new Scanner(System.in)) {
            n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            sum=a[0];
            for(int i=1;i<n;i++){
               if ((a[i]%2==1) && (a[i-1]%2==0)){
                continue;
               }
               else{
                sum=sum+a[i];
               }
            }
        }
        System.out.println(sum);

    }
}
    
