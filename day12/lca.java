import java.util.*;
class lca
{
    static class Node {
    int d;
    Node left, right;
        public Node(int item)
        {
            d = item;
            left = right = null;
        }
    }

    public static void path(Node root , int x , List<Integer> al)
    {
        if(root.d == x)
        {
            al.add(x);
            return ;
        }

        al.add(root.d);
        if(x > root.d)
        {
            path(root.right,x,al);
        }

        if(x < root.d)
        {
            path(root.left,x,al);
        }

    }

    // public static int lca(Node r1 , int x , int y)
    // {
    //     List<Integer> al1 = new ArrayList<>();
    //     List<Integer> al2 = new ArrayList<>();

    //     path(r1,x,al1);
    //     path(r1,y,al2);

    //     System.out.println(al1);
    //     System.out.println(al2);
    //     int lcaa = r1.d;

    //     for(int i = 0 ; i<al1.size() ; i++)
    //     {
    //         if(al1.get(i) != al2.get(i))
    //         {
    //             break;
    //         }
    //         lcaa = al1.get(i);
    //     }

    //     return lcaa;

    // }
    
    public static int lca(Node root , int x , int y)
    {
        if(root.d == x || root.d == y)
        {
            return root.d;
        }
        else if(root.d > x && root.d < y)
        {
            return root.d;
        }
        else if(root.d > x && root.d > y)
        {
            return lca(root.left,x,y);
        }
        else
        {
            return lca(root.right,x,y);
        }
    }

    public static void main(String args[])
    {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);


        System.out.println(lca(root,1,2));

    }
}