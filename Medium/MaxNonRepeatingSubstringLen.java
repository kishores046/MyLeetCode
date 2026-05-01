import java.util.HashMap;
import java.util.Map;

public class MaxNonRepeatingSubstringLen {
    static void main() {
        System.out.println(new MaxNonRepeatingSubstringLen().lengthOfLongestSubstring(" "));
    }

    public int lengthOfLongestSubstring(String s){
        int left=0;
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>1){
                map.compute(s.charAt(left),(k,v)->v-1);
                left++;
            }
            count=Math.max(count,right-left+1);
        }

        return count;
    }
}
