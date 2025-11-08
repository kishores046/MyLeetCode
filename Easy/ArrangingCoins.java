public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int l = 0, h = n;
        while (l <= h) {
            long mid = l + (h - l) / 2;
            if (n >= (mid * (mid + 1) / 2)) l = (int) mid + 1;
            else h = (int) mid - 1;
        }
        return l - 1;
    }

}
