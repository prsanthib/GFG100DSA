// check whether the given BT is BST
//inorder of BST is sorted array

import java.util.*;
class valBST
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

    static int prev = Integer.MIN_VALUE;

    public static boolean isValid(Node root)
    {
        if(root == null)
        {
            return true;
        }

        boolean b1 = isValid(root.left);
        if(root.d < prev)
        {
            return false;
        }
        prev = root.d;
        boolean b2 = isValid(root.right);

        return b1 && b2;
    }
    public static void main(String args[])
    {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.right.right = new Node(5);

        System.out.println(isValid(root));
    }
}