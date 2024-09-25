// Given a square matrix M[][] of size N X N, such that M[i][j] = 1 means ith person knows jth person, the task is to find the celebrity. A celebrity is a person who is known to all but does not know anyone. Return the index of the celebrity, if there is no celebrity return -1.

// Note: Follow 0 based indexing and M[i][i] will always be 0.

import java.util.*;
class celebraty
{
    public static void main(String args[])
    {
        int arr[][] =  { {0, 0, 1, 0}, {0, 0, 1, 0}, {0, 1, 0, 0}, {0, 0, 1, 0} };

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            stack.push(i);
        }

        while(stack.size() != 1)
        {
            int a = stack.pop();
            int b = stack.pop();

            if(arr[a][b] == 1)
            {
                // a knows b => a is not celebraty
                stack.push(b);
            }
            else if(arr[a][b] == 0)
            {
                //a does not know b so b is not celebrity
                stack.push(a);
            }
        }

        int n = stack.pop();
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[n][i] != 0)
            {
                System.out.println("celebrity is not found");
                return;
            }
            if(i != n && arr[i][n] != 1)
            {
                System.out.println("celebrity is not found");
                return;
            }
        }

        System.out.println("celebrity is "+n);
    }
}