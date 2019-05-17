package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode633 {
  public boolean judgeSquareSum(int c) {
    boolean isSquareSum = false;
    int x2 = (int) Math.sqrt(c);
    int x1 = 0;
    while (x1 < x2) {
      if (x1 * x1 + x2 * x2 == c) {
        isSquareSum = true;
        break;
      } else if (x1 * x1 + x2 * x2 < c) {
        x1++;
      } else if (x1 * x1 + x2 * x2 > c) {
        x2--;
      }
    }
    return isSquareSum;
  }


}
