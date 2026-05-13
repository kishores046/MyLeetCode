import java.util.Arrays;

public class PowerOfSizeKArray {
    public int[] resultsArray(int[] nums, int k) {




                int n = nums.length;

                int[] res = new int[n - k + 1];

                // count of valid adjacent relations
                int count = 0;

                // build first window relations
                for (int i = 1; i < k; i++) {

                    if (nums[i] - nums[i - 1] == 1) {
                        count++;
                    }
                }

                // first window result
                res[0] = (count == k - 1) ? nums[k - 1] : -1;

                int index = 1;

                // slide window
                for (int right = k; right < n; right++) {

                    int left = right - k + 1;

                    // remove old left relation
                    if (nums[left] - nums[left - 1] == 1) {
                        count--;
                    }

                    // add new right relation
                    if (nums[right] - nums[right - 1] == 1) {
                        count++;
                    }

                    // current window answer
                    if (count == k - 1) {
                        res[index++] = nums[right];
                    } else {
                        res[index++] = -1;
                    }
                }

                return res;
            }
    static void main(String[] args) {
        System.out.println(Arrays
                .toString(new PowerOfSizeKArray().resultsArray(new int[]{3,2,3,2,3,2},2)));
    }
}
