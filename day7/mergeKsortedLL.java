//merge k sorted linked lists
// It can be done using MinHeaps
// Every time we remove the least node and add it to the list
import java.util.*;
class mergeKsortedLL
{

    static class ListNode
    {
        int data;
        ListNode next;
        public ListNode(int d)
        {
            data = d;
            next = null;
        }
    }

    public static void print(ListNode ll)
    {
        while(ll != null)
        {
            System.out.print(ll.data+"->");
            ll = ll.next;
        }
        System.out.println("null");
    }

    public static ListNode mergeKLists(ListNode[] list)
    {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->(a.data-b.data));
        for(int i = 0 ; i < list.length ; i++)
        {
            while(list[i] != null)
            {
                pq.add(list[i]);
                list[i] = list[i].next;
            }
        }

        ListNode head = pq.poll();
        ListNode temp = head;
        while(!pq.isEmpty())
        {
            temp.next = pq.poll();
            temp = temp.next;
        }

        return head;
    }


    public static void main(String args[])
    {
        ListNode[] lists = new ListNode[3];

        // First list: 1 -> 4 -> 5
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        // Second list: 1 -> 3 -> 4
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        // Third list: 2 -> 6
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        // Merge all the lists
        ListNode mergedList = mergeKLists(lists);

        // Print the merged list
        print(mergedList);

    }
}