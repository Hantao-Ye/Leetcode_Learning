/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
package Question_List;
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        int digit = 0;
        ListNode lNode = root;
        // 传递结点和进位
        while (l1 != null || l2 != null || digit != 0) {
            int l1Val = l1 != null ? l1.val : 0;
            int l2Val = l2 != null ? l2.val : 0;
            int val = (l1Val+l2Val + digit) % 10;
            digit = (l1Val+l2Val + digit) / 10;

            ListNode sumNode = new ListNode(val);
            lNode.next = sumNode;
            lNode = lNode.next;
            if(l1 != null)l1 = l1.next;
            if(l2 != null)l2 = l2.next;
        }
        
        return root.next;
    }
}

// @lc code=end
