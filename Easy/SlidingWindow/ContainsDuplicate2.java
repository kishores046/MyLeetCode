package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }

    static void main() {
        System.out.println(new ContainsDuplicate2().containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }
}
