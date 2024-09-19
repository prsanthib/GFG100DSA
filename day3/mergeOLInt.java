//merge overlapping intervals
//given intervals in any order

import java.util.*;
class mergeOLInt
{
    public static void main(String args[])
    {
        // int arr[][] = {{1,3},{2,4},{6,8},{9,10}};
        //sol -> {1,4},{6,8},{9,10}
        int arr[][] = {{6,8},{1,9},{2,4},{4,7}};
        Arrays.sort(arr,Comparator.comparingDouble(o->o[0]));
        List<List<Integer>> res = new ArrayList<>();

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
        res.add(Arrays.asList(arr[arr.length-1][0],arr[arr.length-1][1]));

        System.out.println(res);
    }
}