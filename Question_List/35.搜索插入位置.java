/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
package Question_List;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            if (nums[i] < target)
                i++;
            else if (nums[i] == target)
                return i;
            else
                return i;

            if (nums[j] > target)
                j--;
            else if (nums[j] == target)
                return j;
            else
                return j + 1;
        }
        return (i + 1 + j) / 2;
    }
}
// @lc code=end
