import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FruitsIntoBaskets {
    public int totalFruit(int[] fruits){
        int max=0;
        int left=0;
        Map<Integer,Integer> seenFruits=new HashMap<>();
        for(int right=0;right<fruits.length;right++){
            seenFruits.put(fruits[right], seenFruits.getOrDefault(fruits[right],0)+1);
            while(seenFruits.size()>2){
                seenFruits.put(fruits[left], seenFruits.get(fruits[left])-1);
                if(seenFruits.get(fruits[left])==0)seenFruits.remove(fruits[left]);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }

    static void main(String[] args) {
        System.out.println(new FruitsIntoBaskets().totalFruit(new int[]{1,2,3,0,0,0,0,0}));
    }
}
