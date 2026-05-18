public class SubarrayProductlessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0;
        int currentWindow=1;
        int totalSubarrays=0;
        for(int right=0;right<nums.length;right++){

            currentWindow*=nums[right];


            while(currentWindow>=k && left<=right){
                currentWindow/=nums[left];
                left++;
            }
            totalSubarrays+=(right-left+1);
        }

        return totalSubarrays;
    }

    static void main() {
        System.out.println(new SubarrayProductlessThanK().numSubarrayProductLessThanK(new int[]{1,2,3},0));
    }
}
