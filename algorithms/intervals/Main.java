package intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
       // int[]  newInterval={4,8};
        //int ans[][]=insert(intervals,newInterval);
        //int ans[][]=merge(intervals);
        // for(int i=0;i<ans.length;i++){
        //     for(int j=0;j<ans[0].length;j++){
        //         System.out.print(ans[i][j]);
        //     }
        //     System.out.println();
        // }
        System.out.println(eraseOverLappingIntervals(intervals));
        
    }

    private static int eraseOverLappingIntervals(int[][] intervals) {
        // TODO Auto-generated method stub
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int toRemove=0;
        for(int i=0;i<intervals.length;i++){
            int currEnd=intervals[i][1];
            while(i+1<intervals.length && currEnd>intervals[i+1][0]){
                toRemove+=1;
                currEnd = Math.min(currEnd, intervals[i+1][1]);
                i+=1;

            }
        }
        return toRemove;
    }

    private static int[][] merge(int[][] intervals) {
        // TODO Auto-generated method stub
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int index=0;
       List<int[]> resList=new ArrayList<>();
       while(index<intervals.length){
        int newStart=intervals[index][0];
        int currEnd=intervals[index][1];
        while(index<intervals.length-1 && currEnd>=intervals[index+1][0]){
            currEnd=Math.max(currEnd, intervals[index+1][1]);
            index+=1;
        }
        int newEnd=currEnd;
        resList.add(new int[]{newStart,newEnd});
        index+=1;
       }
       return resList.toArray(new int[resList.size()][]);
    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        // TODO Auto-generated method stub
        List<int[]> res=new ArrayList<>();
        int curr=0;
        while(curr<intervals.length && intervals[curr][1]<newInterval[0]){
            res.add(intervals[curr++] );

        }
        while(curr < intervals.length && intervals[curr][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0], intervals[curr][0]);
            newInterval[1]=Math.max(newInterval[1], intervals[curr][1]);
            curr++;
        }
        res.add(newInterval);
        while(curr<intervals.length){
            res.add(intervals[curr++]);
        }
        return res.toArray(new int[res.size()][]);
    }
    
    
}
