/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
         * int max = 0; int head = 0; if (s.length()==0) return 0; String s_clone = new
         * String(); String cursor = String.valueOf(s.charAt(0));
         * 
         * for (int i = 0; i < s.length(); i++) { cursor = String.valueOf(s.charAt(i));
         * StringBuffer buf = new StringBuffer();
         * 
         * if (s_clone.contains(cursor)) { head = s_clone.lastIndexOf(cursor) + 1; if
         * (head > s.length()) break; buf.append(s_clone.substring(head));
         * buf.append(cursor); s_clone = buf.toString(); } else { buf.append(s_clone);
         * buf.append(cursor); s_clone = buf.toString(); } max = Math.max(max,
         * s_clone.length()); } return max;
         */
        int maxLength = 0;
        //转换成array使得更好操作
        char[] chars = s.toCharArray();
        //定义左边界
        int leftIndex = 0;
        for (int j = 0; j < chars.length; j++) {
            for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
                if (chars[innerIndex] == chars[j]) {
                    maxLength = Math.max(maxLength, j - leftIndex);
                    leftIndex = innerIndex + 1;
                    break;
                }
            }
        }
        return Math.max(chars.length - leftIndex, maxLength);
    }
}

// @lc code=end
