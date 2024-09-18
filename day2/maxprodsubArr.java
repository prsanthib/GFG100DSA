import java.util.*;
class maxprodsubArr
{
    public static void main(String args[])
    {
        int arr[] = {-2, 6, -3, -10, 0, 2};

        //keep track of min and max

        int currmax = arr[0];
        int currmin = arr[0];
        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i] < 0)
            {
                int temp = currmax;
                currmax = currmin;
                currmin = temp;
            }

            int t = currmax;
            currmax = Math.max(arr[i] ,Math.max( currmax*arr[i], currmin*arr[i]));
            currmin = Math.min(arr[i] ,Math.min( t*arr[i], currmin*arr[i]));
            max = Math.max(currmax , max);
        }

        System.out.println(max);
    }
}