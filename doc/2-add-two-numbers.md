## Add Two Numbers
### 问题描述
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8


### 解决方案
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
            ListNode next = result;
            while((l1!=null) && (l2 != null)){
                next.next = new ListNode(l1.val + l2.val);
                next = next.next;
                l1 = l1.next;
                l2 = l2.next;
                if(l1 == null){
                    next.next = l2;
                }else
                if(l2 == null){
                    next.next = l1;
                }
            }

            next = result;
            int up = 0;
            while(next != null){
                int val = up + next.val;
                up = val / 10;
                next.val = val % 10;
                if(up != 0 && next.next == null){
                    next.next = new ListNode(up);
                    next = next.next;
                }
                next = next.next;
            }
            return result.next;
    }
}
```