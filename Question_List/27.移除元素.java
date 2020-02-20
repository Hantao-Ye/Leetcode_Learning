/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
package Question_List;
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0)
            return 0;
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}
// @lc code=end

