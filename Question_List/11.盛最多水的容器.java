/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
package Question_List;
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0, j = height.length - 1; i < j;) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            max = Math.max(max, (j - i + 1) * minHeight);
        }
        return max;
    }
}
// @lc code=end
