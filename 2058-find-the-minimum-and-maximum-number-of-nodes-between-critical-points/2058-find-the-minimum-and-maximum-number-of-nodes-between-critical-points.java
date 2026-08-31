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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int arr[]={-1,-1};
        ListNode prev=head;
        ListNode curr=prev.next;
        int minVal=Integer.MAX_VALUE;
        int maxVal=-1;
        int first=-1;
        int last=-1;
        int count=2;
        while(curr.next!=null){
            if((curr.val>prev.val && curr.val>curr.next.val) || (curr.val<prev.val && curr.val<curr.next.val)){
               if(first==-1){
                first=count;
               } 
               if(last!=-1){
                minVal=Math.min(minVal,count-last);
               }
               last=count;
            }
            prev=curr;
            curr=curr.next;
            count++;
        }
        if(first==last){
            return arr;
        }
        maxVal=last-first;

        arr[0]=minVal;
        arr[1]=maxVal;
        return arr;
    }
}