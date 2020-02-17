/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
package Question_List;
class Solution {
    public int reverse(int x) {
        /*
         * int output = 0; int sign = 1; StringBuffer sBuffer = new StringBuffer(); if
         * (x < 0) { x = -x; sign = -sign; } while (x > 0) { sBuffer.append(x % 10); x
         * /= 10; } String string = sBuffer.toString(); if (string.length() == 0) return
         * 0; if (Long.parseLong(string)>Math.pow(2.0,31.0)&&sign == -1) return 0; else
         * if (Long.parseLong(string) > (Math.pow(2.0, 31.0) + 1) && sign == 1) return
         * 0; output = sign * Integer.valueOf(string); return output;
         */
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return (int) n == n ? (int) n : 0;
    }
}

// @lc code=end
