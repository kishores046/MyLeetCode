public class ShortestSubarrayToBeRemovedToMakeArraySorted {

    public int findLengthOfShortestSubarray(int[] arr) {

        int len=0;
        int n=arr.length;
        int left = 0;
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        if (left == n - 1) {
            return 0;
        }

        int right = n - 1;
        while (right > 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        len = Math.min(n - left - 1, right);

        int i = 0, j = right;

        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                len = Math.min(len, j - i - 1);
                i++;
            } else {
                j++;
            }
        }
        return len;
    }


    static void main() {
        System.out.println(new ShortestSubarrayToBeRemovedToMakeArraySorted().findLengthOfShortestSubarray(new int[]{1,2,3,10,3,4,2,3,5}));
    }



}
