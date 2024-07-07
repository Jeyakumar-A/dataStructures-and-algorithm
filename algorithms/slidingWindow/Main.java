package slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    //     int[] input={7,1,5,3,6,4};
    //     System.out.println(maxProfit(input));
    String s="abcabcbb";
    System.out.println(lengthOflongestSubString(s));
    
}

    private static int  lengthOflongestSubString(String s) {
        // TODO Auto-generated method stub
        int start=0;
        int end=0;
        int maxLen=Math.min(s.length(),1);
        Set<Character> seen=new HashSet<>();
        while(end<s.length()){
            char c=s.charAt(end);
            while(seen.contains(c)){
                seen.remove(s.charAt(start));
                start+=1;
            }
            seen.add(c);
            int windSize=end-start+1;
            maxLen=Math.max(maxLen, windSize);
            end+=1;
        }
        return maxLen;
        
    }

    private static int maxProfit(int[] input) {
        // TODO Auto-generated method stub
        if(input==null || input.length==0){
            return 0;
        }
        int profit=0;
        int buying_price=input[0];
        for(int i=1;i<input.length;i++){
            if(input[i]<=buying_price){
                buying_price=input[i];
                continue;
            }
            profit=Math.max(profit, input[i]-buying_price);
        }
        return profit;
        
    }
    
}
