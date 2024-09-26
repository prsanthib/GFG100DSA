//Given information about N petrol pumps (say arr[]) that are present in a circular path. The information consists of the distance of the next petrol pump from the current one (in arr[i][1]) and the amount of petrol stored in that petrol pump (in arr[i][0]). Consider a truck with infinite capacity that consumes 1 unit of petrol to travel 1 unit distance. The task is to find the index of the first starting point such that the truck can visit all the petrol pumps and come back to that starting point.
// Note: Return -1 if no such tour exists.

import java.util.*;
class circularTour
{
    public static void main(String args[])
    {
        int arr[][] = {{4, 6}, {6, 5}, {7, 3}, {4, 5}};
        //total pet < total dist its impossible
        //0 -> petrol
        //1->dist
        int tp = 0;
        int td = 0;
        int cp = 0;

        int s = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            tp += arr[i][0];
            td += arr[i][1];
            cp += arr[i][0];

            cp -= arr[i][1]; 
            if(cp < 0)
            {
                s = i+1;
            }
        }

        if(tp < td)
        {
            System.out.println("Not Possible");
            return ;
        }
        System.out.println("Possible from idx "+s);
    }
}