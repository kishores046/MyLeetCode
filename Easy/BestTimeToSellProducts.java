public class BestTimeToSellProducts {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int boughtAmount = prices[0];

        for (int i = 1; i < prices.length; i++) {
            // Update boughtAmount if we find a smaller price (better buy opportunity)
            boughtAmount = Math.min(boughtAmount, prices[i]);

            // Calculate profit if we sell today
            profit = Math.max(profit, prices[i] - boughtAmount);
        }

        return profit;
    }

    static void main() {
        System.out.println(new BestTimeToSellProducts().maxProfit(new int[]{1,2,4}));
    }
}
