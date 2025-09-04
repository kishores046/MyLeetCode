class Solution {
    public int[] twoSum(int[] numbers, int target) {
         int left=0,right=numbers.length-1;
         while(left<right){
            int sum=numbers[left]+numbers[right];
            if(target==sum){
                int[] arr_index={left+1,right+1};
                return arr_index;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}
