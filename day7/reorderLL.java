// Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to A0→An-1→A1→An-2→A2→An-3→...
// For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

import java.util.*;
class reorderLL
{
    static class Node
    {
        int data;
        Node next;

        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Node rev(Node h)
    {
        Node prev = null;
        Node curr = h;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static Node reord(Node h)
    {
        if(h == null || h.next == null)
        {
            return h;
        }

        Node slow = h;
        Node fast = h;

        while(fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                break;
            }
        }

        Node h1 = h;
        Node h2 = rev(slow.next);
        slow.next = null;


        while(h1 != null && h2 != null)
        {
            Node t1 = h1.next;
            h1.next = h2;
            Node t2 = h2.next;
            h2.next = t1;
            h1 = t1;
            h2 = t2;
        }

        return h;
    }

    public static void print(Node h)
    {
        while(h != null)
        {
            System.out.print(h.data+"->");
            h = h.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        print(head);
        head = reord(head);
        print(head);        
    }
}