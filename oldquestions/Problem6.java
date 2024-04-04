import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       int i,j;
       int[] a=new int[10];
       for(i=0;i<n;i++){
        a[i]=sc.nextInt();

       }
       int[] fr=new int[n];
       int visited=-1;
       for(i=0;i<n;i++){
        int count=1;
        for(j=i+1;j<n;j++){
            if(a[i]==a[j]){
                count++;
                fr[j]=visited;
            }
        }
        if(fr[i]!=visited){
            fr[i]=count;
        }

       }
       for(i=0;i<n;i++){
        if(fr[i]!=visited){
            System.out.println(a[i]+"("+fr[i]+")");
            continue;
        }
         if(fr[i]!=visited){
            System.out.println(a[i]+"("+fr[i]+")");
            
            
        }
       }
    }
    
}
