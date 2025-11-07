import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums,int target) {
        Arrays.sort(nums);  // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();
        int differnece=Integer.MAX_VALUE;
        int n = nums.length;
        int res=0;
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate values for 'i'
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];

                if (total < target) {
                    left++;
                    if(differnece>target-total){
                        differnece= target-total;
                        res=total;
                    }
                } else if (total > target) {
                    right--;
                    if(differnece>total-target){
                        differnece= total-target;
                        res=total;
                    }
                } else {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for 'left' and 'right'
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }
        }
        System.out.println(res);

        return result;
    }

    static void main() {
        int[] nums={0,0,0};int target=1;
        ThreeSum obj=new ThreeSum();
        System.out.println(obj.threeSum(nums,target));
    }
}
