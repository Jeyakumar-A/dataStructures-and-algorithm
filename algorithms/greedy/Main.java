package greedy;

public class Main {
    public static void main(String[] args) {
        // int[] nums={2,3,1,1,4};
        // System.out.println(canJump(nums));
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        // TODO Auto-generated method stub
        int total_left=0;
        for(int i=0;i<gas.length;i++){
            total_left += gas[i] - cost[i];
        }
        if(total_left<0){
            return -1;
        }
        int startIndex=0;
        int remaining=0;
        for(int i=0;i<gas.length;i++){
            int currentGas=gas[i]+remaining;
            int currentCost=cost[i];
            remaining=currentGas - currentCost ; 
            if(remaining<0){
                remaining=0;
                startIndex=i+1;
            }
        }
        return startIndex;
    }

    private static boolean canJump(int[] nums) {
        // TODO Auto-generated method stub
        int stepsLeft=nums[0];
        for(int i=0;i<nums.length;i++){
            stepsLeft--;
            if(stepsLeft<0){
                return false;

            }
            if(i==nums.length-1){
                return true;
            }
            if(stepsLeft<nums[i]){
                stepsLeft=nums[i];

            }
        }
        return true;
    }
    
}
