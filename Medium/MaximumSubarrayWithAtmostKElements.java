
import java.util.*;
public class MaximumSubarrayWithAtmostKElements {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3};
        int k=2;
        int n = nums.length;

        // Prefix sum
        int[] P = new int[n + 1];
        for (int i = 0; i < n; i++) {
            P[i + 1] = P[i] + nums[i];
        }

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(0); // index in prefix array
        int ans = Integer.MIN_VALUE;

        for (int j = 1; j <= n; j++) {
            while (!dq.isEmpty() && dq.peekFirst() < j - k) {
                dq.pollFirst();
            }
            ans = Math.max(ans, P[j] - P[dq.peekFirst()]);
            while (!dq.isEmpty() && P[dq.peekLast()] >= P[j]) {
                dq.pollLast();
            }
            dq.addLast(j);
        }
        System.out.println(ans);

    }
}