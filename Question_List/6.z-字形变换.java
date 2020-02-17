/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
// import java.util.*;
package Question_List;
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder ret = new StringBuilder(s.length());
        int n = s.length();
        int cycleLen = 2 * numRows - 2;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleLen) {
                ret.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n)
                    ret.append(s.charAt(j + cycleLen - i));
            }
        }
        return ret.toString();
    }
}

// @lc code=end
