import java.util.Scanner;

public class Problem10 {
    
    public static void main(String[] args) {
        int temp[],m,n,k=0,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenth of first array");
        m=sc.nextInt();
        int a[]=new int[m];
        System.out.println("enter the lenth of second array");
        n=sc.nextInt();
        int b[]=new int[n];
         temp=new int[m+n];
        for(i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        for(j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        i=0;
        j=0;
        while(i<m&&j<n){
            if(a[i]<b[j]){
                temp[k++]=a[i];
                i++;
            }
            else{
                temp[k++]=b[j];
                j++;
            }
        }
        while(i<m){
            temp[k++]=a[i];
            i++;
        }
        while(j<n){
            temp[k++]=b[j];
            j++;
        }

        for(i=0;i<m+n;i++){
            System.out.println(temp[i]);
        }
        
    }
    
}
