class invertBT
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

    public static Node flip(Node root)
    {
        if(root == null)
        {
            return null;
        }

        Node r = flip(root.left);
        Node l = flip(root.right);

        root.left = l;
        root.right = r;

        return root;
    }

    public static void print(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.d+" ");
        print(root.left);
        print(root.right);
    }

    public static void main(String args[])
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.left = new Node(4); 
        root.right.right = new Node(5);

        print(root);
        System.out.println();
        root = flip(root);
        print(root);
    }
}