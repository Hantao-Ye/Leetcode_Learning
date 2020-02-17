/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 */

// @lc code=start
package Question_List;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sBuffer = new StringBuffer();
        int index = 9999;
        if (strs.length == 0)
            return "";
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < index)
                index = strs[i].length();
        }
        for (int i = 0; i < index; i++) {
            char digit = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != digit)
                    return sBuffer.toString();
            }
            sBuffer.append(digit);
        }
        return sBuffer.toString();
    }
}
// @lc code=end
