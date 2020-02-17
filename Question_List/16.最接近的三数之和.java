/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
package Question_List;

import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int output = 0;
        int len = nums.length;
        if (len == 0 || len < 3) {
            for (int i = 0; i < len; i++)
                output += nums[i];
            return output;
        }
        Arrays.sort(nums);
        output = Math.abs(target - nums[0]);
        for (int i = 0; i < len; i++) {
            if (nums[i] > target)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (Math.abs(sum - target) < output) {
                    output = Math.abs(sum - target);
                    while (L < R && nums[L] == nums[L + 1])
                        L++; // 去重
                    while (L < R && nums[R] == nums[R - 1])
                        R--; // 去重
                    L++;
                    R--;
                } else if (sum - target < 0)
                    L++;
                else if (sum - target > 0)
                    R--;
            }
        }
        return output;
    }
}
// @lc code=end
