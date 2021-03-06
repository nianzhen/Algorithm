package nianzhen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class LeetCode121 {

//  给定一个二叉树，检查它是否是镜像对称的。
//
//  例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
//
//    1
//    / \
//    2   2
//    / \ / \
//    3  4 4  3
//  但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
//
//    1
//    / \
//    2   2
//    \   \
//    3    3
//  说明:
//
//  如果你可以运用递归和迭代两种方法解决这个问题，会很加分

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    return isMirror(root, root);


  }

  /**
   * 第一种解法
   *
   * @param left
   * @param right
   * @return
   */
  public boolean isMirror(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }

    if (left == null || right == null) {
      return false;
    }

    return isMirror(left.left, right.right) && isMirror(left.right, right.left);
  }

  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
