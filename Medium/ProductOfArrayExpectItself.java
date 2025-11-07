public class ProductOfArrayExpectItself {
    public int[] productExceptSelf(int[] nums) {
        	int[] l=new int[nums.length];
		int[] r=new int[nums.length];
		l[0]=1;
		r[nums.length-1]=1;
		for(int i=1,j=nums.length-2;i<nums.length;i++,j--){
			int t=nums[i-1];
			l[i]=l[i-1]*t;
            int o=nums[j+1];
			r[j]=o*r[j+1];	
        }
		for(int i=0;i<nums.length;i++){
		    nums[i]=r[i]*l[i];	
        }
        return nums;
    }
}
