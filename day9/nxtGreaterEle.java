import java.util.*;
class nxtGreaterEle
{
    public static void util(int arr[] , int res[] , Stack<Integer> stack)
    {
        for(int i = arr.length-1 ; i>= 0 ; i--)
        {
            while(!stack.isEmpty() && stack.peek() <= arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                res[i] = -1;
            }
            else
            {
                res[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
    }

    public static void main(String args[])
    {
        int arr[] = {13,17,6,12 };
        Stack<Integer> stack = new Stack<>();
        int res[] = new int[arr.length];
        util(arr,res,stack);
        for(int i = 0 ; i < arr.length ; i++)  
        {
            System.out.print(res[i]+" ");
        }
        System.out.println();
        
    }
}