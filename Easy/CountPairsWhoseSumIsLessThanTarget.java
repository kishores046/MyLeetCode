import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    static void main() {
        List<Integer> nums= Arrays.asList(-6,2,5,-2,-7,-1,3);
        nums.sort(Integer::compareTo);
        System.out.println(nums);
        int l=0,h=nums.size()-1;
        int target=-2;
        int count=0;
        while(l<h){
            int mid=nums.get(l)+ nums.get(h);
            if(mid<target){
                count+=(h-l);
                l++;
            }else h--;
        }
        System.out.println(count);
    }
}
