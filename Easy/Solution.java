import java.util.List;
import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int max=0;
         for(int i:candies){
            max=Math.max(max,i);
         }
        List<Boolean> kids=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
             kids.add((candies[i]+extraCandies)>=max);
        }
        return kids;
    }
    public static void main(String[] args){
        Solution obj=new Solution();
        int[] array={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(obj.kidsWithCandies(array,extraCandies));
    }
}