import java.util.*;
class reverseLL
{
    static class Node
    {
        int data ;
        Node next;
        public Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static Node rev(Node head)
    {
        Node prev = null;
        Node curr = head;
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
    public static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }        
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        print(head);
        Node rh = rev(head);
        print(rh);
    }
}