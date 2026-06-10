import java.util.Arrays;
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closeness=Integer.MAX_VALUE;
        int res=0;
        for (int i = 0; i < nums.length-2; i++) {
            if (i>0 && nums[i]==nums[i-1])
                continue;
            int left = i + 1;
            int right = nums.length-1;
            while (left < right) {
                int sum=nums[i] + nums[left] + nums[right];

                if (sum > target){
                    right--;
                    if(closeness>sum-target){
                        closeness=sum-target;
                        res=sum;
                    }

                }
                else if(sum<target){
                    left++;
                    if(closeness>target-sum){
                        closeness=target-sum;
                        res=sum;
                    }
                }else return sum;
            }
        }
        return res;
    }
}
