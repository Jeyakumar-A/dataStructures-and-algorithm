package codeio;

import java.util.ArrayList;
import java.util.Stack;

public class BracketNumbers {
    public static void main(String[] args) {
        String s="(aa(bdc))p(dec)dee";
        System.out.println(bracketNumbers(s));
    }

    private static ArrayList<Integer> bracketNumbers(String s) {
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        int counter=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                ans.add(counter);
                st.push(counter);
                counter++;

            }
            else if(s.charAt(i)==')'){
                ans.add(st.peek());
                st.pop();
            }
            else{
                continue;
            }
        }
        return ans;
    }
    
}
