/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start

class Solution {
    public int myAtoi(String str) {
        char[] str_array = str.toCharArray();
        int sign = 0;
        int num = 0;
        long output = 0;
        int i = 0;
        while (i < str.length() && ((str_array[i] <= '9' && str_array[i] >= '0') || str_array[i] == '+'
                || str_array[i] == '-' || str_array[i] == ' ')) {
            if (output != (int) output) {
                if (sign < 0)
                    return -2147483648;
                else
                    return 2147483647;
            }
            if (str_array[i] <= '9' && str_array[i] >= '0') {
                output = output * 10 + (int) (str_array[i] - '0');
                num = 1;
            } else if ((str_array[i] == '+' || str_array[i] == '-')) {
                if (sign != 0 || num != 0) {
                    return my_return(output, sign);
                } else if (str_array[i] == '-')
                    sign = -1;
                else if (str_array[i] == '+')
                    sign = 1;
            } else if (str_array[i] == ' ' && (num != 0 || sign != 0))
                return my_return(output, sign);
            i++;
        }
        return my_return(output, sign);
    }

    public int my_return(long output, int sign) {
        if (sign < 0)
            return (int) output == output ? (int) output * sign : -2147483648;
        else
            return (int) output == output ? (int) output : 2147483647;
    }
}
// @lc code=end
