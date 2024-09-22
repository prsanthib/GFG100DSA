import java.util.*;
class detectCycle
{
    static class Node
    {
        int data;
        Node next;
        public Node(int d )
        {
            data = d;
            next = null;
        }
    }

    public static boolean hasCycle(Node head)
    {
        Node s = head;
        Node f = head;
        while(f != null)
        {
            s = s.next;
            f = f.next.next;
            if(s == f)
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next = head.next.next.next;

        System.out.println(hasCycle(head));
    }
}