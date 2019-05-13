package nianzhen;

import java.util.ArrayList;
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

        // 未代码 最大堆排序

        return result;
    }
}
