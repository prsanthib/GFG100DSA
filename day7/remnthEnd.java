// remove nth node from the End of the list

import java.util.*;
class remnthEnd
{
    static class Node {
    int data;
    Node next;
        public Node(int new_data) {
            data = new_data;
            next = null;
        }
    }

    public static void remove(Node head , int n)
    {
        int c = 1;
        Node temp = head;
        int len = 0;

        while(temp != null)
        {
            temp = temp.next;
            len ++;
        }
        
        temp = head;

         while(c < len-n)
         {
            temp = temp.next;
            c++;
         }

         temp.next = temp.next.next;
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

        int n = 2;
        remove(head,n);
        print(head);
    }
}