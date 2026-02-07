import java.util.*;
void main(String[] args) {
    int[] nums={5,10,15,17};
    int k=2;
    Arrays.sort(nums);
    int ans = Integer.MAX_VALUE, j = k - 1;
    for(int i = 0; i + j < nums.length; i++) {
        ans = Math.min(ans, nums[i + j] - nums[i]);
    }
    IO.println(ans);




}