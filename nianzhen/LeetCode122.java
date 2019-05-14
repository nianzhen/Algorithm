package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode122 {

  //  输入: [7,1,5,3,6,4]
//  输出: 7
//  解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
//  随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
  public static int maxProfit(int[] prices) {

    //贪心

    if (prices.length < 2) {
      return 0;
    }

    int maxPrice = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - prices[i - 1] > 0) {
        maxPrice = maxPrice + prices[i] - prices[i - 1];
      }
    }

    return maxPrice;

  }

  public static void main(String[] args) {
    int[] number =[7, 1, 5, 3, 6, 4];
    System.out.print(maxProfit(number));
  }
}
