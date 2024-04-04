import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        int n,i,j,m;
        // Scanner sc=new Scanner(System.in);
        // n=sc.nextInt();
        n=5;
        m=(n+1)/2;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j){
                    if(i<m){
                    System.out.print(n-i+1);
                    }
                
                    else{
                    System.out.print(i);
                }
            }
                else if(i+j==n+1)
                {
                     if(i<n){
                    System.out.print(i);
                    }
                
                    else{
                    System.out.print(j);

                }

            }
            else{
                System.out.print(" ");
            }

        }
         System.out.println("\n");
    }
   
    
}
}
