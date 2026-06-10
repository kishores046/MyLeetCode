package Hard;

public class TrappingRainWater {


    /**
     * Algorithm: Two-Pointer Water Trapping
     * Idea:
     * Water trapped at any index depends on the tallest bar on its left
     * and the tallest bar on its right.
     * Water at index i:
     *     water[i] = min(leftMax, rightMax) - height[i]
     * Instead of precomputing leftMax and rightMax arrays, use two pointers
     * and maintain the maximum heights seen so far from both ends.
     * Steps:
     * 1. Initialize:
     *      left = 0
     *      right = n - 1
     *      leftMax = 0
     *      rightMax = 0
     *      water = 0
     * 2. While left < right:
     *      a) If height[left] < height[right]:
     *          - The left side becomes the limiting boundary.
     *          - If height[left] is greater than or equal to leftMax,
     *            update leftMax.
     *          - Otherwise, water can be trapped at this position:
     *                water += leftMax - height[left]
     *          - Move left pointer forward.
     *      b) Otherwise:
     *          - The right side becomes the limiting boundary.
     *          - If height[right] is greater than or equal to rightMax,
     *            update rightMax.
     *          - Otherwise, water can be trapped at this position:
     *                water += rightMax - height[right]
     *          - Move right pointer backward.
     * 3. Continue until both pointers meet.
     * Why it works:
     * - When height[left] < height[right], a boundary exists on the right
     *   that is at least as tall as height[left].
     * - Therefore the trapped water on the left side depends only on leftMax.
     * - Similarly, when height[right] <= height[left], the trapped water on
     *   the right side depends only on rightMax.
     * - This allows water to be calculated in a single pass without storing
     *   auxiliary arrays.
     * Time Complexity:
     *      O(n)
     * Space Complexity:
     *      O(1)
     */
    public int trap(int[] height) {
        int n = height.length;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        int left=0;
        int right=n-1;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax=height[left];
                }else water+=leftMax-height[left];
                left++;
            }else {
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }else water+=rightMax-height[right];
                right--;
            }
        }
        return water;
    }
}
