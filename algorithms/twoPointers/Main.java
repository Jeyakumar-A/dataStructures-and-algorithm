package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //int ans=0;
        // String s="A man,a plan,a canal:Panama";
        // System.out.println(isPalindrome(s));
       // int[] nums={2,7,11,15};
       // int target=9;
        //System.out.println(threeSum(nums));
       // List<Integer> ans=twoSum(nums,target);
        //System.out.println(ans);
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        //System.out.println(containerWithMostWater(height));
        System.out.println(trappingRainWater(height));
    }

    private static int trappingRainWater(int[] height) {
        // TODO Auto-generated method stub
        int[] left=new int[height.length];
        int[] right= new int[height.length];
        int max=-1;
        for(int i=0;i<height.length;i++){
            if(height[i]>=max){
                max=height[i];
            }
            left[i]=max;
        }
        max=-1;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>=max){
                max=height[i];
            }
            right[i]=max;
        }
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(left[i], right[i]) - height[i];
        }
        return total;
    }

    private static int containerWithMostWater(int[] height) {
        // TODO Auto-generated method stub
       int left=0;
       int right=height.length-1;
       int max=-1;
       while(left<right){
        max=Math.max(max, (right-left)*Math.min(height[left], height[right]));
        if(height[left]<height[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return max;
    }

    private static List<Integer> twoSum(int[] nums, int target) {
        // TODO Auto-generated method stub
        List<Integer> ans = new ArrayList<>();
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int currSum=nums[left]+nums[right];
            if(currSum==target){
                ans.add(left);
                ans.add(right);
                return ans;
            }
            else if(currSum<left){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
        
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        // TODO Auto-generated method stub
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null || nums.length==0){
            return result;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Set<String> used=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int currSum=nums[i]+nums[j];
                if(map.containsKey(-1*currSum)){
                    int k=map.get(-1*currSum);
                    if(!used.contains(nums[i]+":"+nums[j]+":"+nums[k])&& k>i &&k>j){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        used.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }
                }
            }
        }
        return result;
    }

    private static boolean isPalindrome(String s) {
        // TODO Auto-generated method stub
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(Character.isLetter(s.charAt(start))&& Character.isLetter(s.charAt(end))){
                if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                else{
                    start++;
                    end--;
                }
            }
           else if(Character.isDigit(s.charAt(start)) && Character.isDigit((s.charAt(end)))){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                else{
                    start++;
                    end--;
                }
            }
            else if(!Character.isLetter(s.charAt(start))&&!Character.isDigit(s.charAt(start))){
                start++;
            }
            else if(!Character.isLetter(s.charAt(end))&&!Character.isDigit(s.charAt(end))){
                end--;
            }
            else{
                return false;
            }
            
        }
        return true;
    }
}
