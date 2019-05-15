#
# @lc app=leetcode.cn id=167 lang=python3
#
# [167] 两数之和 II - 输入有序数组
#
class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        length = len(numbers)
        left = 0
        right = length - 1
        while left < right:
            count = numbers[left] + numbers[right]
            if count == target:
                return [left+1,right+1]
            elif count < target:
                left += 1
            else:
                right -=1
        return None

