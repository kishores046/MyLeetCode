package Hard;

public class SubstringWithKDistinctIntegers {
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {

        int[] freq = new int[nums.length + 1];

        int left = 0;
        int distinct = 0;
        int total = 0;

        for (int right = 0; right < nums.length; right++) {

            if (freq[nums[right]] == 0) {
                distinct++;
            }

            freq[nums[right]]++;

            while (distinct > k) {

                freq[nums[left]]--;

                if (freq[nums[left]] == 0) {
                    distinct--;
                }

                left++;
            }

            total += (right - left + 1);
        }

        return total;
    }
}
