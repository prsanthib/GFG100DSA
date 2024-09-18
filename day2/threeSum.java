//using 3 for loops O(n^3)
//using 2 for loops and a hashmap by which u calculate sum of 2 nums and search for tar-sum val in hashmap  O(n^2)
//using sorting and two pointer technique O(n^2)


//Arrays.asList(1,2,3);
import java.util.*;
class threeSum
{
    //fun to find pair with given sum
    static List<List<Integer>> list = new ArrayList<>();

    public static void util(int arr[], int s , int e , int tar)
    {
        int l = s;
        int r = e;

        while(l<r)
        {
            int sum = arr[l]+arr[r];
            if(sum == tar)
            {
                list.add(Arrays.asList(arr[l],arr[r],-tar));
                l++;
                r--;
            }
            else if(sum > tar)
            {
                r--;
            }
            else
            {
                l++;
            }
        }

    }

    public static void main(String args[])
    {
        int  arr[] = {0, -1, 2, -3, 1};
        Arrays.sort(arr);
        list.clear();
        for(int i = 0 ; i < arr.length ;i++)
        {
            int tar = -arr[i];
            util(arr,i+1,arr.length-1,tar);
        }

        for(int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }
}