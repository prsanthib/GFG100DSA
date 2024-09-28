// chaeck if a bt is subtree of other tree
import java.util.*;
class subtree
{
    static class Node
    {
        int d;
        Node left;
        Node right;
        
        public Node(int d)
        {
            this.d = d;
            left = null;
            right = null;
        }
    }
    
    public static boolean check(Node n1 , Node n2)
    {
        if(n1 == null && n2 == null || n2 == null)
        {
            return true;
        }

        if(n1 == null || n1.d != n2.d)
        {
            return false;
        }



        return check(n1.left,n2.left) && check(n1.right,n2.right);
    }

    public static boolean isSub(Node n1 , Node n2)
    {
        if(n1 == null && n2 == null || n2 == null)
        {
            return true;
        }

        if(n1 == null)
        {
            return false;
        }

        if(n1.d == n2.d)
        {
            return check(n1,n2);
        }

        return isSub(n1.left,n2) || isSub(n1.right,n2);
    }

    public static void main(String args[])
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.left.right = new Node(5);

        System.out.println(isSub(root,root2));
    }
}