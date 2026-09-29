package daily.topinterview150.arraystring;
// 122. Best Time to Buy and Sell Stock II（Greedy）
public class Q0122MaxProfit {

    public int maxProfit(int[] prices) {
        
        int profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // 只要今天比昨天貴，就把這段上漲全部賺走
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;

    }

}