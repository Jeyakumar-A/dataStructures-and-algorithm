package codeio;
/*input=5
 * output=2
 * input=4
 * output=2
 */
public class SquareRootofNumber {
public static void main(String[] args) {
    int x=5;
    int ans=floorSqrt(x);
    System.out.println(ans);
}

private static int floorSqrt(int x) {
    int start=1;
    int end=x;
    int mid,ans=0;
    while(start<=end){
        mid=(start+end)/2;
        if(mid*mid==x){
            return mid;
        }
        else if(mid<=(x/mid)){
            start=mid+1;
            ans=mid;
        }
        else{
            end=mid-1;
        }
    }
    return ans;
}
    
}
