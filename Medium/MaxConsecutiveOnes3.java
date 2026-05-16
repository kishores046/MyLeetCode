public class MaxConsecutiveOnes3 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int currentZeroesInWindow = 0;
        int max = 0;
        for (int right = 0; right < nums.length; right++) {
            currentZeroesInWindow += nums[right] == 0 ? 1 : 0;
            while (currentZeroesInWindow > k) {
                if (nums[left] == 0) {
                    currentZeroesInWindow--;
                }
                left++;
            }
            max = Math.max(max, right - left +1);
        }
        return max;
    }

    static void main(String[] args) {
        System.out.println(new MaxConsecutiveOnes3().longestOnes(new int[]{0,1,1,1,0,1,1,0,1},1));
    }
}

