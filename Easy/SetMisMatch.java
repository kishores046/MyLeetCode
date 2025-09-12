import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMisMatch {
    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        int n = nums.length;
        int[] v = new int[n + 1];
        int missing = 0, duplicate = 0;

        for (int i = 0; i < n; i++) {
            v[nums[i]]++;
        }

        for (int i = 1; i < v.length; i++) {
            if (v[i] == 2) {
                duplicate = i;
            }
            if (v[i] == 0) {
                missing = i;
            }
        }
        int[] arr={duplicate,missing};
        System.out.println(Arrays.toString(arr));

        
    }
}