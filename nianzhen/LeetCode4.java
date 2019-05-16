package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class LeetCode4 {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int first;
    int second;
    int totalNum = nums1.length + nums2.length;

    boolean isQi = false;
    if (totalNum % 2 == 0) {
      isQi = false;
      first = (nums1.length + nums2.length) / 2 - 1;
      second = (nums1.length + nums2.length) / 2;
    } else {
      first = second = (nums1.length + nums2.length) / 2;
      isQi = true;
    }

    if (isQi) {
      first = second = (nums1.length + nums2.length) / 2;
    } else {
      first = (nums1.length + nums2.length) / 2 - 1;
      second = (nums1.length + nums2.length) / 2;
    }

    if (nums1.length == 0) {
      if (isQi) {
        return nums2[first];
      } else {
        return (nums2[first] + nums2[second]) / 2;
      }
    } else if (nums2.length == 0) {
      if (isQi) {
        return nums1[first];
      } else {
        return (nums1[first] + nums1[second]) / 2;
      }
    }

    int x1 = 0;
    int x2 = 0;

    double sum = 0;


    while (x1 < nums1.length && x2 < nums2.length) {
      if (nums1[x1] < nums2[x2]) {

        if (x1 + x2 == first || x1 + x2 == second) {
          sum += nums1[x1];
        }
        x1++;
      } else {
        if (x1 + x2 == first || x1 + x2 == second) {
          sum += nums2[x2];
        }
        x2++;
      }
    }

    while (x1 < nums1.length) {
      if (x1 + x2 == first || x1 + x2 == second) {
        sum += nums1[x1];
      }
      x1++;
    }
    while (x2 < nums2.length) {
      if (x1 + x2 == first || x1 + x2 == second) {
        sum += nums2[x2];
      }
      x2++;
    }
    return isQi ? sum : sum / 2;

//        int first;
//        int second;
//        int totalNum = nums1.length + nums2.length;
//
//        if (totalNum % 2 == 0) {
//            first = (nums1.length + nums2.length) / 2 - 1;
//            second = (nums1.length + nums2.length) / 2;
//        } else {
//            first = second = (nums1.length + nums2.length) / 2;
//        }
//
//        int idx1 = 0, idx2 = 0;
//
//        double sum = 0;
//        while (idx1 < nums1.length && idx2 < nums2.length) {
//            if (nums1[idx1] < nums2[idx2]) {
//                if (idx1 + idx2 == first || idx1 + idx2 == second) {
//                    sum += nums1[idx1];
//                }
//                idx1++;
//            } else {
//                if (idx1 + idx2 == first || idx1 + idx2 == second) {
//                    sum += nums2[idx2];
//                }
//                idx2++;
//            }
//        }
//        while (idx1 < nums1.length) {
//            if (idx1 + idx2 == first || idx1 + idx2 == second) {
//                sum += nums1[idx1];
//            }
//            idx1++;
//        }
//        while (idx2 < nums2.length) {
//            if (idx1 + idx2 == first || idx1 + idx2 == second) {
//                sum += nums2[idx2];
//            }
//            idx2++;
//        }
//
//        return first == second ? sum : sum / 2;

  }

}
