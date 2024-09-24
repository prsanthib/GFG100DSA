// merge 2 sorted linked lists inplace 
//i.e dont allocate extra memory for them 

import java.util.*;
class merge2sortedLL
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


    public static Node merge(Node t1 , Node t2)
    {
        if(t1 == null)
        {
            return t2;
        }
        if(t2 == null)
        {
            return t1;
        }

        Node head = null;
        Node temp = null;

        if(t1.data < t2.data)
        {
            head=temp=t1;
            t1 = t1.next;
            temp.next = null ;
        }
        else
        {
            head=temp=t2;
            t2 = t2.next;
            temp.next = null ;
        }

        while(t1 != null && t2 != null) 
        {
            if(t1.data <= t2.data)
            {
                temp.next=t1;
                t1 = t1.next;
                temp = temp.next ;
                temp.next = null;
            }
            else
            {
                temp.next = t2 ; 
                t2 = t2.next;
                temp = temp.next ;
                temp.next = null ; 
            }
        }

        while(t1 != null)
        {
            temp.next=t1;
            t1 = t1.next;
            temp = temp.next ;
            temp.next = null;
        }

        while(t2 != null)
        {
            temp.next = t2 ; 
            t2 = t2.next;
            temp = temp.next ;
            temp.next = null ; 
        }

        return head;
    }

    public static void print(Node h)
    {
        Node t = h;
        while(t != null)
        {
            System.out.print(t.data+"->");
            t = t.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Node a = new Node(2);
        a.next = new Node(4);
        a.next.next = new Node(8);
        a.next.next.next = new Node(9);

        print(a);

        Node b = new Node(1);
        b.next = new Node(3);
        b.next.next = new Node(8);
        b.next.next.next = new Node(10);

        print(b);

        Node h = merge(a,b);
        print(h);
    }
}