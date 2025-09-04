class Solution {
    public boolean increasingTriplet(int[] nums) {
      int j=Integer.MAX_VALUE,k=Integer.MAX_VALUE;
      for(int num:nums){
        if(num<=j){
            j=num;
        }
        else if(num<=k){
            k=num;
        }
        else{ 
            return true;
        }
    }
    return false;
    }
}
