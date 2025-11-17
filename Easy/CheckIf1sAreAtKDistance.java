public class CheckIf1sAreAtKDistance {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;  // index of previous 1

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev != -1 && (i - prev - 1) < k) {
                    return false;   // distance is less than k
                }
                prev = i;  // update previous 1 position
            }
        }

        return true;
    }


    static void main() {
        CheckIf1sAreAtKDistance obj=new CheckIf1sAreAtKDistance();
        System.out.println(obj.kLengthApart(new int[]{1,0,1,0,0,1},2));
    }
}
