package array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        //int target=9;
        //int k=2;
        //List<Integer> ans= new ArrayList<>();
        //ans =  twoSum(nums,target);
       // ans=topKFrequent(nums,k);
       int ans=longestConsecutive(nums);
        System.out.println(ans);
    }

    private static int longestConsecutive(int[] nums) {
        // TODO Auto-generated method stub
        Set<Integer> set = new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num-1)){
                continue;
            }
            int currentLength=0;
            while(set.contains(num)){
                currentLength++;
                num+=1;

            }
            max=Math.max(max, currentLength);
        }
        return max;
    }

    private static List<Integer> topKFrequent(int[] nums, int k) {
        // TODO Auto-generated method stub
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> countMap= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!countMap.containsKey(nums[i])){
                countMap.put(nums[i],1);
            }
            countMap.put(nums[i], countMap.get(nums[i])+1);
        }
        Map<Integer,List<Integer>> reverseCountMap = new HashMap<>();
        for(int num:countMap.keySet()){
            int count=countMap.get(num);
            if(!reverseCountMap.containsKey(count)){
                reverseCountMap.put(count, new ArrayList<Integer>());
                reverseCountMap.get(count).add(num);

            }
        }
        int index=0;
        for(int possibleCount=nums.length;possibleCount>=1;possibleCount--){
            if(reverseCountMap.containsKey(possibleCount)){
                for(int n:reverseCountMap.get(possibleCount)){
                    if(index<k){
                        result.add(n);
                        index++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(index>k){
                break;
            }
        }

        return result;
    }

    private static List<Integer> twoSum(int[] nums, int target) {
        // TODO Auto-generated method stub
       Map<Integer,Integer> map= new HashMap<>();
       List<Integer> list= new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i])){
            list.add(i);
            list.add(map.get(target-nums[i]));
            return list;
        }
        map.put(nums[i], i);
       }
       return null;
    }
}