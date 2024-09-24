//Delete last occurrence of an item from linked list
//Given a singly linked list and a key, the task is to delete the last occurrence of that key in the linked list.
import java.util.*;
class dltLastOcc
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

    public static void print(Node h)
    {
        while(h != null)
        {
            System.out.print(h.data+"->");
            h = h.next;
        }
        System.out.println("null");
    }

    public static Node util(Node h , int k)
    {
        Node prev = null;
        if(h.data == k)
        {
            prev = h;
        }
        Node at;
        Node temp = h;
        while(temp.next != null)
        {
            if(temp.next.data == k)
            {
                prev = temp;
            }
            temp = temp.next;
        }
        if(prev == h)
        {
            h = h.next;
        }
        else
        {
            prev.next = prev.next.next;
        }
        return h;
    }

    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        int key = 1;
        head = util(head , key);
        print(head);
    }
}