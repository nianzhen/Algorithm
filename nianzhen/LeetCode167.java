package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode167 {

//  给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
//
//  函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
//
//  说明:
//
//  返回的下标值（index1 和 index2）不是从零开始的。
//  你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
//  示例:
//
//  输入: numbers = [2, 7, 11, 15], target = 9
//  输出: [1,2]
//  解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。

  public int[] twoSum(int[] numbers, int target) {
    int[] numb = new int[2];
    int first = 0;
    int end = numbers.length - 1;
    while (first < end) {
      if ((numbers[first] + numbers[end]) == target) {
        first++;
        end++;
        numb[0] = first;
        numb[1] = end;
        break;
      } else if ((numbers[first] + numbers[end]) > target) {
        end--;
      } else if ((numbers[first] + numbers[end]) < target) {
        first++;
      }
    }
    return numb;
  }

}
