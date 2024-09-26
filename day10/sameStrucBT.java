//Given two binary trees. The task is to write a program to check if the two trees are identical in structure.

class sameStrucBT
{
    static class Node 
    { 
        int data; 
        Node left; 
        Node right; 
        public Node(int d)
        {
            data = d;
        }
    }; 

    public static boolean sameSt(Node r1 , Node r2)
    {
        if(r1 == null && r2 == null)
        {
            return true;
        }
        if(r1 == null || r2 == null)
        {
            return false;
        }

        return sameSt(r1.left,r2.left) && sameSt(r1.right,r2.right);
    }

    public static void main(String args[])
    {
        Node root1 = new Node(10); 
        Node root2 = new Node(100); 
        root1.left = new Node(7); 
        root1.right = new Node(15); 
        root1.left.left = new Node(4); 
        root1.left.right = new Node(9); 
        root1.right.right = new Node(20); 
 
        root2.left = new Node(70); 
        root2.right = new Node(150); 
        root2.left.left = new Node(40); 
        root2.left.right = new Node(90); 
        root2.right.right = new Node(200);

        System.out.println(sameSt(root1,root2));
    }
}