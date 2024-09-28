//find kth smallest val in BST

import java.util.*;
class kthSmallest
{
    static class Node
    {
        int d ;
        Node left;
        Node right;
        public Node(int d)
        {
            this.d = d;
            left = null;
            right = null;
        }
    }


    public static int kthSmall(Node root)
    {
        if(root == null)
        {
            return -1;
        }

        int l = kthSmall(root.left);

        if(l != -1)
        {
            return l;
        }

        k--;

        if(k == 0)
        {
            return root.d;
        }

        return kthSmall(root.right);
    }

    static List<Integer> al = new ArrayList<>();
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return ;
        }

        //inorder
        inorder(root.left); 
        al.add(root.d);
        inorder(root.right);

    }

    public static int k ;
    static int val;
    public static void main(String args[])
    {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);
        
        k = 1;
        //inorder(root);
        //System.out.println(al.get(k-1));

        System.out.println(kthSmall(root));
    }
}