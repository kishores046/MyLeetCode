import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int[] reminders = new int[k];
        int count = 0;
        int currSum = 0;
        reminders[0] = 1;

        for(int num : nums) {
            currSum += num;
            int rem = currSum % k;
            if(rem < 0) rem += k;

            count += reminders[rem];

            reminders[rem]++;
        }
        System.out.println(Arrays.toString(reminders));
        return count;
    }

    static void main(String[] args) {
        int[] arr=new int[]{10, 5, 2, 7, 1, -10};
        int k=15;
        System.out.println(new CountSubarraySumEqualsK().subarraySum(arr,k));
    }
}
