class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length==0)
        {
            return null;
        }
        ListNode head=new ListNode(0);
        ListNode temp=head;
        while(true)
        {
            int p=0;
            for(int i=0;i<lists.length;i++)
            {
                if(lists[p]==null || lists[i]!=null && lists[p].val > lists[i].val)
                    p=i;
            }
            if(lists[p]==null)
            {
                break;
            }
            temp.next=lists[p];
            temp=temp.next;
            lists[p]=lists[p].next;
        }
        return head.next;
    }
}

/*Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6] */
