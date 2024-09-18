//find least element in rotated sorted array

import java.util.*;

class BSinRArr
{
    public static void main(String args[])
    {
        int arr[] = {5, -1,1, 2, 3, 4};
        int s = 0;
        int e = arr.length-1;
        while(s<=e)
        {
            if(arr[s] <= arr[e])
            {
               // System.out.println(arr[s]);
                break;
            }

            int mid = (s+e)/2;
            
            if(arr[mid] < arr[e])
            {
                e = mid;
            }
            else
            {
                s = mid+1;
            }
        }

        System.out.println(arr[s]);
    }
}