import java.util.Arrays;

public class SuccessfulPairsOfSpellAndPortion {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result=new int[spells.length];
        Arrays.sort(potions);
        for (int i=0;i<spells.length;i++) {
            long spell=spells[i];
            int start = 0;
            int end = potions.length - 1;
            int res = -1;
            while (start <= end) {

                int mid = (start+end)/2;
                if (potions[mid] *spell >= success) {
                    res = mid;
                    end=mid-1;
                }  else {
                    start = mid +1;
                }
            }
            result[i]=(res!=-1)?potions.length-res:0;
        }
        return result;
    }
}
