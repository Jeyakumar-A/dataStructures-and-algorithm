package sept2023;

public class Ifcase {
    public static void main(String[] args) {
        int i=0;
        for(int count=i;count<5;count++){
            switch(count){
                case 0:{
                    System.out.println("print");
                    break;
                }
                case 1:{
                    System.out.println(count++);
                
                }
                case 3:{
                    System.out.println(count);
                    
                }
                case 4:{
                    System.out.println(count);
                    break;
                }
                default:{
                    System.out.println("count inr");
                    break;
                }
            }
            
        }
    }
}
