package heap;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
       // int k=2;
        //System.out.println(findKthLargest(nums,k));
        System.out.println(lastStoneWeight(nums));
    }

    private static int lastStoneWeight(int[] nums) {
        // TODO Auto-generated method stub
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for(int stone:nums){
            maxHeap.add(stone);
        }
            while(maxHeap.size()>0){
                int stoneOne=maxHeap.poll();
                if(maxHeap.size()==0){
                    return stoneOne;
                }
                int stoneTwo=maxHeap.poll();
                if(stoneOne!=stoneTwo){
                    maxHeap.add(Math.abs(stoneOne-stoneTwo));
                }
            }
            return 0;
        
    }

    private static int findKthLargest(int[] nums, int k) {
        // TODO Auto-generated method stub
       PriorityQueue<Integer> minHeap= new PriorityQueue<>();
       for(int i=0;i<nums.length;i++){
        if(minHeap.size()<k || nums[i] > minHeap.peek()){
            minHeap.add(nums[i]);
        }
        if(minHeap.size()>k){
            minHeap.poll();
        }
       }
       return minHeap.poll();
    }
}
