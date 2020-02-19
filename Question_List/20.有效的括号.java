/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
package Question_List;
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> iStack = new Stack<>();
        int sign = 1;
        char[] array = s.toCharArray();
        if (array.length % 2 != 0)
            return false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '{' || array[i] == '[' || array[i] == '(') {
                iStack.push(array[i]);
            } else if (array[i] == '}' || array[i] == ']' || array[i] == ')') {
                if (iStack.isEmpty())
                    return false;
                char pop = iStack.pop();
                if (array[i] == ')') {
                    if (pop != '(') {
                        sign--;
                        break;
                    }
                } else if (array[i] == ']') {
                    if (pop != '[') {
                        sign--;
                        break;
                    } 
                } else {
                    if (pop != '{') {
                        sign--;
                        break;
                    } 
                }

            }
        }
        if (!iStack.isEmpty() || sign != 1)
            return false;
        else
            return true;
    }
}
// @lc code=end
