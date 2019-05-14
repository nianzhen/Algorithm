// 1004. 最大连续1的个数 III

// 输入：A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
// 输出：6
// 解释： 
// [1,1,1,0,0,1,1,1,1,1,1]
// 粗体数字从 0 翻转到 1，最长的子数组长度为 6。


// 输入：A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
// 输出：10
// 解释：
// [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// 粗体数字从 0 翻转到 1，最长的子数组长度为 10。



// 题目解析
// 特征：数组，区间运算
// 窗口算法
int longestOnes(int* A, int ASize, int K){
    

    // 定义 左右下标起始为0 。长度为 右下标 - 左下标 + 1
    // 遍历数组
    // 如果遇到 1  ，右下标 + 1右移
    // 如果遇到 0 
    // 判断k是否为0，如果为0，达到窗口最大宽度，与上一个最大值比较，如果大于则更新最大值，左下标移动，遇到 0， 右移一位，停止,k+ 1，
    // 右下标右移，遇到 0 ，k - 1。
    // 重复

}