void main() {
    int[] arr={0,1,1,1,1,1,0,0,0};
    IO.println(findMaxLength(arr));
}
public int findMaxLength(int[] nums) {
    for(int i=0;i<nums.length;i++){
        nums[i]=nums[i]==1?1:-1;
    }
    System.out.println(Arrays.toString(nums));
    Map<Integer,Integer> map=new HashMap<>();
    int prefixSum=0;
    int maxLen=0;
    for (int i = 0; i < nums.length; i++) {
        prefixSum+=nums[i];

        if(prefixSum==0){
            maxLen=i+1;
        }
        if (map.containsKey(prefixSum)){
            int len=i-map.get(prefixSum);
            maxLen=Math.max(maxLen,len);
        }
        if(!map.containsKey(prefixSum)){
            map.put(prefixSum,i);
        }
    }
    return maxLen;
}