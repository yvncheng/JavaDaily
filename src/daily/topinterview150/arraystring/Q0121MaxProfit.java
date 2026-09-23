package daily.topinterview150.arraystring;
// 121. Best Time to Buy and Sell Stock
public class Q0121MaxProfit {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE; // 目前最低價格
        int maxProfit = 0; // 目前最大利潤

        for (int price : prices) {
            // 若當前價格更低，更新最低買入價格
            if (price < minPrice) {
                minPrice = price;
            }

            // 計算今天賣出可獲得的利潤
            int profit = price - minPrice;

            // 更新最大利潤
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
        
    }
}
