package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode121 {
  public int maxProfit(int[] prices) {

    if (prices.length <= 0) {
      return 0;
    }

    int maxPrice = 0;
    int min = prices[0];
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] - min > maxPrice) {
        maxPrice = prices[i] - min;
      }
      if (prices[i] < min) {
        min = prices[i];
      }
    }

    return maxPrice;

  }
}
