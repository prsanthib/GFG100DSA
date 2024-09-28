//maximum sum of nodes in a path starting and ending at any node
import java.util.*;
class maxPathSum
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

    static int max = Integer.MIN_VALUE;

    public static int findMax(Node root)
    {
        if(root == null)
        {
            return 0;
        }

        int l = findMax(root.left);
        int r = findMax(root.right);

        //sum can be l+n , r+n , n , l+r+n

        int max_sum = Math.max(Math.max(l,r)+root.d,root.d);
         max = Math.max(Math.max(max,max_sum),l+r+root.d);

        return max_sum;
    }

    public static void main(String args[])
    {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
        root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);

        findMax(root);
        System.out.println(max);
    }
}