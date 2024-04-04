import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        int n,a[],b[],i,j,h=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        b=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            b[h++]=sum(a[i]);
        }
        for(i=0;i<h;i++){
            for(j=i+1;j<h;j++){
                if(b[i]==b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                else if (b[i]>b[j]){
                     int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            System.out.println(a[i]);
        }
        
    }

    private static int sum(int n) {
        int s=0;
        while(n!=0){
            int r=n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
    
}
