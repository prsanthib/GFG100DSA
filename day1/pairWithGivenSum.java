//Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of elements in the array whose sum is equal to target.

// here we are gonna use binary search
//sort the array , for each ele find the diff between target and the num
//search for the diff
//if it exists then return true

import java.util.*;
class pairWithGivenSum
{

    public static boolean BinarySearch(int arr[] , int key , int s , int e)
    {
        while(s <= e)
        {
            int mid = (s+e)/2;
            if(arr[mid] == key)
            {
                return true;
            }
            else if(key > arr[mid])
            {
                s = mid+1;
            }
            else
            {
                e = mid-1;
            }
        }
        return false;
    }

    public static boolean findPair(int arr[] , int tar)
    {
        //sort the array
        Arrays.sort(arr);
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            int diff = tar-arr[i];
            if(BinarySearch(arr,diff,i+1,arr.length-1))
            {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[])
    {
        int arr[] = {2,5,4,7,2,7,7};
        int tar = 5;
        System.out.println(findPair(arr,tar));
    }
}