void main() {

    int[] arr={4,5,2,1};
    int[] queries={3,10,21};
    System.out.println(Arrays.toString(answerQueries(arr,queries)));
}

public int[] answerQueries(int[] nums, int[] queries) {
    Arrays.sort(nums);
    //int[] prefixSum=new int[nums.length];
    int[] res=new int[queries.length];

    for(int i=1;i< nums.length;i++){
        nums[i]=nums[i]+nums[i-1];
    }
    int index=0;
    for (int q:queries){
        int left=0;
        int right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<=q){
                left=mid+1;
            }else right =mid;
        }
        if (nums[left] <= q)
            res[index++] = left + 1;
        else
            res[index++] = left;
    }
    return res;
}