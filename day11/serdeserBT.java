//store the BT as preorder and inorder
//now reconstruct it using preorder and postorder 

import java.util.*;
class serdeserBT
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

    static List<Integer> pre = new ArrayList<>();
    static List<Integer> in = new ArrayList<>();

    public static void preIn(Node node)
    {
        if(node == null)
        {
            return ;
        }

        pre.add(node.d);
        preIn(node.left);
        in.add(node.d);
        preIn(node.right);
    }

    public static void serialize(Node root)
    {
        for(int i = 0 ; i < pre.size() ; i++)
        {
            System.out.print(pre.get(i)+" ");
        }

        System.out.println();

        for(int i = 0 ; i < in.size() ; i++)
        {
            System.out.print(in.get(i)+" ");
        }
        System.out.println();
    }
    

    public static Node deserialize(int ins , int ine)
    {
        if(ins > ine)
        {
            return null;
        }

        Node root = new Node(pre.get(0));

        if(ins == ine)
        {
            pre.remove(0);
            return root;
        }

        int ch = pre.get(0);
        pre.remove(0);
        int idx = search(ch,ins,ine);
        root.left = deserialize(ins,idx-1);
        root.right = deserialize(idx+1,ine);

        return root;
    }

    public static int search(int ch , int s , int e)
    {
        int i = s;
        for( ; i <= e ; i++)
        {
            if(in.get(i) == ch)
            {
                return i;
            }
        }
        return i;
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

        preIn(root);
        serialize(root);
        Node node = deserialize(0,in.size()-1);
        in.clear();
        pre.clear();
        preIn(node);
        serialize(node);
    }
}