import java.util.*;
class MoveZeroes {
    public void moveZeroes(int[] nums) {
     int non_zero=0;
     for(int i=0;i<nums.length;i++){
        if(nums[i]!=0){
            int temp=nums[non_zero];
            nums[non_zero]=nums[i];
            nums[i]=temp;
            non_zero++;
        }
     } 
    }
}
