package amazon;

/*Say you have an array for which the ith element is the price of a given stock on day i.

        If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

        Note that you cannot sell a stock before you buy one.

        Example 1:

        Input: [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Not 7-1 = 6, as selling price needs to be larger than buying price.
        Example 2:

        Input: [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transaction is done, i.e. max profit = 0.*/

public class BestTimeToButSellStocks {

    public static void main(String[] args) {

        int[] Input =  {7,1,5,3,6,4};
        int[] Input1 =  {7,6,4,3,1};
        int[] Input3 = {2,1,2,0,1};
        int[] Input2 = {2,1,2,1,0,1,2};


         System.out.println(maxProfit(Input));
         System.out.println(maxProfit(Input1));
         System.out.println(maxProfit(Input3));
         System.out.println(maxProfit(Input2));
    }

    public static int maxProfit(int[] prices) {

        int profit = 0;
        if(prices.length > 0) {
            int bought = prices[0];

            for (int i = 0; i < prices.length; i++) {
                if (bought < prices[i]) {
                    if (profit < prices[i] - bought)
                        profit = prices[i] - bought;
                } else if (bought > prices[i]) {
                    bought = prices[i];
                }


            }
        }
       return profit;

    }
}
