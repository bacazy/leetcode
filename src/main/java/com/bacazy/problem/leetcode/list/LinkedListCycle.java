package com.bacazy.problem.leetcode.list;

/**
 * Given a linked list, determine if it has a cycle in it. <br>
 *     Follow up:<br>
 *     Can you solve it without using extra space?
 */
public class LinkedListCycle {
    public class ListNode{
        ListNode next;
        int val;
        public ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    /**
     * 使用两个指针，一个指针单倍速度移动，另一个指针双倍速度移动，若有环时，两个指针肯定会重合。
     * 无环时，双倍速度移动的指针会为null
     * @param head 链表
     * @return 链表是否有环
     */
    public boolean hasCycle(ListNode head){
        ListNode p1 = head;
        if (p1 == null){
            return false;
        }
        ListNode p2 = head.next;
        while (p1 != p2){
            if (p2 == null){
                return false;
            }
            p2 = p2.next;
            if (p2 == null){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

}
