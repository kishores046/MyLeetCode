import java.util.ArrayList;
import java.util.List;

public class PrintMaximumSubArrayWithoutNegatives {

    public static ArrayList<Integer> findSubarray(int[] arr) {

        long maxEnding = 0;
        long maxSoFar = -1;

        int start = 0, end = -1;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < 0) {
                maxEnding = 0;
                tempStart = i + 1;
                continue;
            }

            maxEnding += arr[i];


            if (maxEnding > maxSoFar) {
                maxSoFar = maxEnding;
                start = tempStart;
                end = i;
            }


            else if (maxEnding == maxSoFar) {
                if ((i - tempStart) > (end - start)) {
                    start = tempStart;
                    end = i;
                }
            }
        }


        if (end == -1) {
            return new ArrayList<>(List.of(-1));
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            res.add(arr[i]);
        }

        return res;
    }


    static void main(String[] args) {
        System.out.println(findSubarray(new int[]{-1, 2}));
    }
}
