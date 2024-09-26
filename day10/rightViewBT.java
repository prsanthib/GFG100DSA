import java.util.*;
class rightViewBT
{
    static class Node
    {
        int data ;
        Node left;
        Node right;

        public Node(int d)
        {
            data = d;
            left = null;
            right = null;
        }
    }

    public static void rightView(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        int prev = 0;
        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                System.out.println(prev);
                if(q.isEmpty())
                {
                    break;
                }
                q.add(null);
            }
            else
            {
                prev = curr.data;
                if(curr.left != null)
                {
                    q.add(curr.left);
                }
                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }
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

        rightView(root);
    }
}