public class MaxConsecutiveOnes {
    static void main() {
        int[] nums={1,0,1,1,1,0,1};
        int currOnes=0;
        int maxOnes=0;
        for (int num : nums) {
            if (num == 1) {
                currOnes++;
            } else {
                maxOnes = Math.max(maxOnes, currOnes);
                currOnes = 0;
            }
        }
        System.out.println(Math.max(maxOnes,currOnes));

    }
}
