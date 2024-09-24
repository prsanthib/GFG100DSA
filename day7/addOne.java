// given a LL and representing a number
// add one to it

import java.util.*;
class addOne
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

    public static Node sol(Node h)
    {
        if(h == null)
        {
            return new Node(1);
        }

        h = rev(h);
        //add 1
        int val = (h.data+1)%10;
        int carry = (h.data+1)/10;
        h.data = val;

        if(carry == 0)
        {
            return rev(h);
        }

        Node t = h;
        t = t.next;
        Node prev = null;

        while(carry != 0 && t != null)
        {
            val = (t.data+1)%10;
            carry = (t.data+1)/10;
            t.data = val;
            prev = t;
            t = t.next;
        }

        if(carry == 0)
        {
            return rev(h);
        }
        else
        {
            prev.next = new Node(1);
        }

        return rev(h);
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
        Node head = new Node(9);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(9);

        head = sol(head);
        print(head);
    }
}