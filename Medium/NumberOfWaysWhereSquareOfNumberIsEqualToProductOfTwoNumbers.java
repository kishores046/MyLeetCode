import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {
    public int numTriplets(int[] nums1, int[] nums2) {

        Map<Integer, Integer> freq1 = new HashMap<>();

        Map<Integer, Integer> freq2 = new HashMap<>();

        for (int i : nums1)
            freq1.put(i, freq1.getOrDefault(i, 0) + 1);

        for (int i : nums2)
            freq2.put(i, freq2.getOrDefault(i, 0) + 1);

        Arrays.sort(nums1);

        Arrays.sort(nums2);

        long ans = helper(nums1, nums2, freq2);
        ans += helper(nums2, nums1, freq1);

        return (int) ans;

    }

    private long helper(int[] nums1, int[] nums2, Map<Integer, Integer> freq2) {

        long res = 0;

        for (int i = 0; i < nums1.length; i++) {

            long curr = (long) nums1[i] * nums1[i];

            int left = 0;
            int right = nums2.length - 1;

            while (left < right) {

                long product = (long) nums2[left] * nums2[right];

                if (product < curr) {
                    left++;
                }

                else if (product > curr) {
                    right--;
                }

                else {

                    if (nums2[left] != nums2[right]) {

                        int leftFreq = freq2.get(nums2[left]);
                        int rightFreq = freq2.get(nums2[right]);

                        res += (long) leftFreq * rightFreq;

                        left += leftFreq;
                        right -= rightFreq;
                    }

                    else {

                        long k = right - left + 1;

                        res += k * (k - 1) / 2;

                        break;
                    }
                }
            }
        }

        return res;
    }
}
