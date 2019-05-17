package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class LeetCode345 {
  public String reverseVowels(String s) {
    char[] inx = s.toCharArray();

    int x1 = 0;
    int x2 = inx.length - 1;
    HashSet<Character> strings = new HashSet();
    strings.add('a');
    strings.add('e');
    strings.add('i');
    strings.add('o');
    strings.add('u');
    strings.add('A');
    strings.add('E');
    strings.add('I');
    strings.add('O');
    strings.add('U');
    while (x1 < x2) {
      if (strings.contains(inx[x1]) && strings.contains(inx[x2])) {
        char temp = inx[x2];
        inx[x2] = inx[x1];
        inx[x1] = temp;
        x1++;
        x2--;
      } else {
        if (!strings.contains(inx[x1])) {
          x1++;
        }

        if (!strings.contains(inx[x2])) {
          x2--;
        }
      }
    }

    return new String(inx);
  }

}
