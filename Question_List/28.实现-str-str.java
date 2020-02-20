/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现 strStr()
 */

// @lc code=start
package Question_List;
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.equals("")) return 0;
        int result = -1;
        int lenN = needle.length();
        int lenH = haystack.length();
        for (int i = 0; i <= lenH - lenN; i++) {
            if (haystack.substring(i, i + lenN).equals(needle)) {
                result = i;
                break;
            }
        }
        return result;
    }
}
// @lc code=end
