class Solution {
    public Node copyRandomList(Node head)
{
   Map<Node, Node> map = new HashMap<>();
   Node temp = head;
   while (temp != null)
   {
      map.put(temp, new Node(temp.val));
      temp = temp.next;
   }

   temp = head;
   Node dummy = new Node(0);
   Node prev = dummy;
   while (temp != null)
   {
      prev.next = map.get(temp);
      map.get(temp).random = map.get(temp.random);

      prev = prev.next;
      temp = temp.next;
   }

   return dummy.next;
}
}


/*Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]  */
