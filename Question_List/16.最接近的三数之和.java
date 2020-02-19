/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
// package Question_List;
package Question_List;

import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int output = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < len - 2; i++) {
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum - target < 0) {
                    if (Math.abs(sum - target) < Math.abs(output - target))
                        output = sum;
                    L++;
                } else if (sum - target > 0) {
                    if (Math.abs(sum - target) < Math.abs(output - target))
                        output = sum;
                    R--;
                } else {
                    return target;
                }
            }
        }
        return output;
    }
}
// @lc code=end
