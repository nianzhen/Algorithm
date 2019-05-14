package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LeetCode692 {
  public List<String> topKFrequent(String[] words, int k) {

    List<String> result = new ArrayList();
    if (words == null || words.length <= 0) {
      return result;
    }
    Map<String, Integer> map = new HashMap();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    // 然后用最大堆排序
    // 最大堆的排序的时间就是0(nlogn) 空间复杂度就是o(n)
    // 代码 最大堆排序
    //因为最大堆的逻辑比较复杂，就想换一个方式实现。

    List<String>[] list = new List[words.length + 1];
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      int count = entry.getValue();
      if (list[count] == null) {
        list[count] = new ArrayList<>();
      }
      list[count].add(entry.getKey())
    }

    for (List<String> stringList : list) {
      if (list != null) {
        Collections.sort(stringList);
      }
    }

    //取出最大的K个
    for (int i = list.length - 1; i >= 0 && result.size() <= k; i--) {
      if (list[i] != null) {
        for (String item : list[i]) {
          if (result.size() == k) {
            return result;
          }
          result.add(item)
        }
      }
    }

    return result;

  }
}
