//Given two n-ary trees, the task is to check if they are the mirror of each other or not. Print “Yes” if they are the mirror of each other else “No”.

import java.util.*;
class mirrorNArray
{
    public static boolean find(int[] u1 ,int[] v1 ,int[] u2 ,int[] v2 )
    {
        HashMap<Integer,Stack<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < u1.length ; i++)
        {
            if(!map.containsKey(u1[i]))
            {
                Stack<Integer> s = new Stack<>();
                s.push(v1[i]);
                map.put(u1[i],s);
            }
            else
            {
                map.get(u1[i]).push(v1[i]);
            }
        }

        for(int i = 0 ; i < u2.length ; i++)
        {
            if(!map.containsKey(u2[i]))
            {
                return false;
            }
            if(map.get(u2[i]).pop() != v2[i])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[])
    {
        //tree 1
        int[] u1 = { 1, 1, 1, 10, 10, 10 };
        int[] v1 = { 10, 7, 3, 4, 5, 6 };
         
        // Tree 2
        int[] u2 = { 1, 1, 1, 10, 10, 10 };
        int[] v2 = { 3, 7, 10, 6, 5, 4 };

        //here edge is u1->v1
        //i.e for every edge u1->v1 and u1->v2 there should exist u1->v2 first and then u1->v1

        System.out.println(find(u1,v1,u2,v2));
       
    }
}