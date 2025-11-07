public class SortColors {
    public void sortColors(int[] nums) {
        int max=Integer.MIN_VALUE;
    for(int i:nums){
        max=Math.max(i,max);
    }
    int[] count=new int[max+1];
    for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
    }
    int index=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            nums[index++]=i;
            count[i]--;
        }
    }
    }
}
