import java.util.*;
class maxDepthBt
{
    static class Node
    {
        int d;
        Node l;
        Node r;
        public Node(int d)
        {
            this.d = d;
            l = null;
            r = null;
        }
    }

    public static int depth(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        return Math.max(depth(root.l),depth(root.r))+1;
    }

    public static void main(String args[])
    {
        Node root = new Node(1);
        root.l = new Node(2);
        root.r = new Node(2);
        root.l.l = new Node(2);
        root.l.r = new Node(2);
        root.r.l = new Node(2);
        root.r.l.l = new Node(2);
        
        System.out.println(depth(root));

    }
}