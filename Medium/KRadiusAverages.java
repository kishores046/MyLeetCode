import java.util.Arrays;

public class KRadiusAverages {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        long[] prefix=new long[n];
        int[] res=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        long currWindow=0;
        for(int i=0;i<nums.length;i++){
            if(i-k>=0 && i+k<nums.length){
                if (currWindow == 0) {
                    currWindow = prefix[i + k] - (i - k - 1 >= 0 ? prefix[i - k - 1] : 0);
                } else {
                    currWindow = currWindow - nums[i - k - 1] + nums[i + k];
                }

                if(k==0)res[i]=nums[i];
                else res[i]=(int)(currWindow/(k*2+1));
            }
            else res[i]=-1;
        }

        return res;

    }

    static void main() {
        System.out.println(Arrays.toString(new KRadiusAverages().getAverages(new int[]{1000},0)));
    }
}


/*

more optimized approach
*class Solution {
    public int[] getAverages(int[] nums, int k) {
        if (k == 0) return nums;

        int n = nums.length;

        var res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = -1;
        }

        int windowSize = 2 * k + 1;
        if (windowSize > n) return res;

        long sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        res[k] = (int) (sum / windowSize);

        for (int i = windowSize; i < n; i++) {
            sum += nums[i] - nums[i - windowSize];
            res[i - k] = (int) (sum / windowSize);
        }

        return res;
    }
}
* */
