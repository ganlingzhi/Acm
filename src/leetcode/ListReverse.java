package leetcode;

public class ListReverse {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 1; i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        reverseList(head);
    }

    public static void reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        while (pre != null) {
            System.out.println(pre.val);
            pre = pre.next;
        }
    }
}



