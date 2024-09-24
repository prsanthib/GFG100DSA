import java.util.*;
class findMid
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

    public static int findM(Node h)
    {
        if(h == null)
        {
            return -1;
        }

        if(h.next == null)
        {
            return h.data;
        }

        Node s = h;
        Node f = h;
        while(f != null && f.next != null)
        {
            s = s.next;
            f = f.next.next;
        }

        return s.data;

    }

    public static void main(String args[])
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(findM(head));
    }
}