import java.util.Arrays;
import java.util.List;

public class CountPairsWhoseSumIsLessThanTarget {
    static void main() {
        List<Integer> nums= Arrays.asList(1,2,3,4,5);
        nums.sort(Integer::compareTo);

        int l=0,h=nums.size()-1;
        int target=7;
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
