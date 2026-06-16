import java.util.Arrays;
public class ValidTriangleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int count = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;

            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    count += (j - i);
                    j--;
                } else {
                    i++;
                }
            }
        }

        return count;

    }

    static void main() {
        System.out.println(new ValidTriangleNumber().triangleNumber(new int[]{2,2,3,4}));
    }

    public boolean check(int a,int b,int c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
