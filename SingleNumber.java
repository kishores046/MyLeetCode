class SingleNumber {
    public int singleNumber(int[] nums) {
        int target=0;
        for(int i=0;i<nums.length;i++){
            target^=nums[i];
        }
        return target;
    }
}
