//we are given an array of chocolate packets with no of chocolates in it
//there are m members
//give them the packets such that diff b/w min and max no of chocolates is minimum
//return the min diff

import java.util.*;
class chocolateDist
{
    public static void main(String args[])
    {
        //int arr[] = {7,3,2,4,9,12,56};
        int arr[] = {3,4,1,9,56,7,9,12};
        int m = 5;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <= arr.length-m ; i++)
        {
            min = Math.min(min,arr[i+m-1]-arr[i]);
        }

        System.out.println(min);
    }
}