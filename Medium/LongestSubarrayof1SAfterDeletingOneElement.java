public class LongestSubarrayof1SAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int window = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0)  window++;
            while (window > 1) {
                if (nums[left] == 0) {
                    window--;
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max-1;
    }
}
