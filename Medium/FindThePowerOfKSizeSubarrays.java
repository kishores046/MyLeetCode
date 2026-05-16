public class FindThePowerOfKSizeSubarrays {
    public int[] resultsArray(int[] nums, int k) {

        int n = nums.length;

        int[] res = new int[n - k + 1];


        int count = 0;


        for (int i = 1; i < k; i++) {

            if (nums[i] - nums[i - 1] == 1) {
                count++;
            }
        }


        res[0] = (count == k - 1) ? nums[k - 1] : -1;

        int index = 1;


        for (int right = k; right < n; right++) {

            int left = right - k + 1;


            if (nums[left] - nums[left - 1] == 1) {
                count--;
            }


            if (nums[right] - nums[right - 1] == 1) {
                count++;
            }


            if (count == k - 1) {
                res[index++] = nums[right];
            } else {
                res[index++] = -1;
            }
        }

        return res;
    }
}
