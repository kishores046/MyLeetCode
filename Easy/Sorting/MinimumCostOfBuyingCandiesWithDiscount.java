package Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        for(int i=0,j=cost.length-1;i<j;i++,j--){
            int temp=cost[i];
            cost[i]=cost[j];
            cost[j]=temp;
        }

        System.out.println(Arrays.toString(cost));
        int total=0;
        for(int i=0;i<cost.length;i++){
           if((i+1)%3!=0)total+=cost[i];
        }

        return total;
    }

    static void main() {
        System.out.println(new MinimumCostOfBuyingCandiesWithDiscount().minimumCost(new int[]{6,5,7,9,2,2}));
    }
}
