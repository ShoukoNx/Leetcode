

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode real = dummyHead;
        ListNode p=l1,q=l2;
        int sum = 0,jw=0;
        while(l1!=null||l2!=null){
            int x = (l1!=null)?l1.val:0;
            int y = (l2!=null)?l2.val:0;
            sum=x+y+jw;
            real.next=new ListNode(sum%10);
            real=real.next;
            jw=sum/10;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        if(jw!=0){
            real.next=new ListNode(jw);
        }
        return dummyHead.next;
    }
}