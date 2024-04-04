import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        int n,a[],flag=0,index=0;
        System.out.println("enter the length of an array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        for(int i=0;i<n;i++){
            if(i!=index){
                if(a[i]*2<=max){
                    flag=1;
                }
                else{
                    System.out.println("-1");
                    return;
                }
            }
        }
        if(flag==1){
            System.out.println(index);
        }
    }
    
}
