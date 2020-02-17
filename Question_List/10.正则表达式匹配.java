/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
package Question_List;
class Solution {
    public boolean isMatch(String s, String p) {
        int[][] array = new int[s.length()][p.length()];
        char[] s_array = s.toCharArray();
        char[] p_array = p.toCharArray();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (s_array[i] == p_array[j] || p_array[j] == '.') {
                    if (i == 0 || j == 0)
                        array[i][j] = 1;
                    else
                        array[i][j] = array[i - 1][j - 1] + 1;
                } else if (p_array[j] == '*') {
                    if (j - 1 < 0 || j + 1 > s.length()) {
                        if (j - 1 < 0 && j + 1 <= s.length()) {
                            if (p_array[j + 1] == s_array[i] || p_array[j + 1] == '.') {
                                if (i == 0 || j == 0)
                                    array[i][j] = 1;
                                else
                                    array[i][j] = array[i - 1][j - 1];
                            }
                        } else {
                            if (p_array[j - 1] == s_array[i] || p_array[j - 1] == '.') {
                                if (i == 0 || j == 0)
                                    array[i][j] = 1;
                                else
                                    array[i][j] = array[i - 1][j - 1] + 1;
                            }
                        }
                    } else {
                        if (p_array[j + 1] == s_array[i] || p_array[j + 1] == '.') {
                            if (i == 0 || j == 0)
                                array[i][j] = 1;
                            else
                                array[i][j] = array[i - 1][j - 1];
                        } else if (p_array[j - 1] == s_array[i] || p_array[j - 1] == '.') {
                            if (i == 0 || j == 0)
                                array[i][j] = 1;
                            else
                                array[i][j] = array[i - 1][j - 1] + 1;
                        }
                    }
                }
                if (array[i][j] > max)
                    max = array[i][j];
            }
        }
        if (max == s.length())
            return true;
        else
            return false;
    }
}
// @lc code=end
