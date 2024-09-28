import java.util.*;
class conBtInPo
{
    static class Node
    {
        char d;
        Node left;
        Node right;
        public Node(char d)
        {
            this.d = d;
            left = null;
            right = null;
        }
    }
    
    public static void preOrder(Node node)
    {
        if(node == null)
        {
            return ;
        }

        preOrder(node.left);
        System.out.print(node.d+" ");
        preOrder(node.right);
    }

    static int pIdx = 0;

    public static int search(char in[] , int s , int e , char ch)
    {
        int i = s;
        while(i <= e)
        {
            if(in[i] == ch)
            {
                return i;
            }
            i++;
        }
        return i;
    }

    public static Node constt(char in[] , char pre[] , int ins ,int ine)
    {

        if(ins > ine)
        {
            return null;
        }

        //make the curr node as root
        Node root = new Node(pre[pIdx]);

        if(ins == ine)
        {
            pIdx++;
            return root;
        }

        //search for the root in inorder
        int idx = search(in,ins,ine,pre[pIdx]);
        pIdx++;
        //left of inorder goes to leftsubtree
        root.left = constt(in,pre,ins,idx-1);
        root.right = constt(in,pre,idx+1,ine);

        return root;

    }

    public static void main(String args[])
    {
        char in[] = new char[] { 'D', 'B', 'E', 'A', 'F', 'C' };
        char pre[] = new char[] { 'A', 'B', 'D', 'E', 'C', 'F' };

        Node root = constt(in,pre,0,in.length-1);
        preOrder(root);
        System.out.println();

    } 
}