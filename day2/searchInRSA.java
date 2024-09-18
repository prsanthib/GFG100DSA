// search in rotated sorted array
class searchInRSA
{
    public static int fun(int arr[] , int k)
    {
        int s = 0;
        int e = arr.length-1;

        while(s<=e)
        {
            int mid = (s+e)/2;
            
            if(arr[mid] == k)
            {
                return mid;
            }

            else if(arr[s] <= arr[mid])
            {
                if(k >= arr[s]&& k <= arr[mid])
                {
                    e = mid-1;
                }
                else
                {
                    s = mid+1;
                }
            }
            else
            {
                if(k >= arr[mid]&& k <= arr[e])
                {
                    s = mid+1;
                }
                else
                {
                    e = mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {4, 5, 6, 7, 0, 1, 2} ;
        int key = 7;
        System.out.println(fun(arr,key));
    }
}