public class soulution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode findMiddle(ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);// 1 st ka end
        LIstNode secondhalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while (secondhalfStart != null) {
            if (firstHalfStart.val != secondhalfStart.val) {
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondhalfStart = secondhalfStart.next;
        }
        return true;
    }
}
