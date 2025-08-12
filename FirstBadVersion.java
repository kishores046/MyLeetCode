

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1, right = n, mid;

        while (left < right) {
            mid = (right - left) / 2 + left;  


            if (isBadVersion(mid)) {
                right = mid;   
            } else {
                left = mid + 1;  
            
            }
        }

        return left;  
    }
}
