// Insert in sorted and non overlapping interval array

// append new interval at the last and perform merge interval
import java.util.*;
class insertInInterval
{
    public static List<List<Integer>> res = new ArrayList<>();
    public static void mergeInt(int arr[][])
    {
        Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            if(arr[i][1] < arr[i+1][0])
            {
                res.add(Arrays.asList(arr[i][0],arr[i][1]));
            }
            else
            {
                int val = arr[i][1] > arr[i+1][1] ? arr[i][1] : arr[i+1][1] ;
                arr[i+1][0] = arr[i][0];
                arr[i+1][1] = val;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[][] = {{1,3},{6,9}};
        int newInt[] = {4,5};
        int merged[][] = new int[arr.length+1][arr[0].length+1];
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                merged[i][j] = arr[i][j];
            }
        }
        merged[merged.length-1][0] = newInt[0];
        merged[merged.length-1][1] = newInt[1];

        mergeInt(merged);
    }
}