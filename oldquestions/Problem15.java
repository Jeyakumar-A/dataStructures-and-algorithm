public class Problem15 {
    public static void main(String[] args) {
        int a=10,b=5,c=0;
        while(b>0){
            c=c+a-b;
            b=b-1;
        }
        System.out.println(c);
    }
    
}
