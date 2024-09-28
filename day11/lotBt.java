import java.util.*;
class lotBt
{
    static class Node {
    int data;
    Node left, right;
        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static void lot(Node node)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);

        while(!q.isEmpty())
        {
            Node curr = q.remove();
            if(curr == null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                q.add(curr);
            }
            else
            {
                System.out.print(curr.data+" ");

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

        lot(root);
        System.out.println();

    }
}