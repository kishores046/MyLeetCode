import java.util.*;
public class SlidingWindowMaximum{
 public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
            if (dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            if (i >= k - 1) {
                res.add(nums[dq.peekFirst()]);
            }
        }

        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }

        return resArr;

    }
   public static void main(String[] args){
       System.out.println(Arrays.toString(new SlidingWindowMaximum().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}
