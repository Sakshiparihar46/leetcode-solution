/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        //min-heap to keep track of the smallest current nodes
        PriorityQueue<ListNode> que = new PriorityQueue<>((a, b) -> a.val - b.val);

        //add the head of each list to the heap
        for (ListNode node : lists) {
            if (node != null) {
                que.add(node);
            }
        }

        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while (!que.isEmpty()) {
            ListNode curr = que.poll();
            res.next = curr;
            res = res.next;

            if (curr.next != null) {
                que.offer(curr.next);
            }
        }
        return dummy.next;
    }
}
