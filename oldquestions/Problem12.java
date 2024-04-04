import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        int n,a[],i,j,e[],o[],e1=0,o1=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=new int[n];
        e=new int[10];
        o=new int[10];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                e[e1++]=a[i];
            }
            else{
                o[o1++]=a[i];
            }
        }
        //bubble sort descending order
        for(i=0;i<e1;i++){
            for(j=i+1;j<e1;j++){
                if(e[i]<e[j]){
                    int t=e[i];
                    e[i]=e[j];
                    e[j]=t;

                }
            }
        }
        //bubble sort for ascending order
         for(i=0;i<o1;i++){
            for(j=i+1;j<o1;j++){
                if(o[i]>o[j]){
                    int t=o[i];
                    o[i]=o[j];
                    o[j]=t;
                    
                }
            }
        }
        for(i=0,j=0;i<e1&&j<o1;i++,j++){
            System.out.print(o[j]+""+e[i]);
        }
        while(i<e1){
            System.out.println(e[i]);
            i++;
        }
        while(i<o1){
            System.out.println(o[i]);
            i++;
        }

    }
    
}
