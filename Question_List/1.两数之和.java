/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
package Question_List;
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>((int) ((float) nums.length / 0.75F + 1.0F));
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum value");
    }
}
// @lc code=end
