//Given an array of n elements that contains elements from 0 to n-1, with any of these numbers appearing any number of times. Find these repeating numbers in O(n) and use only constant memory space.

//Note: The repeating element should be printed only once.

//we can use hashmap to store count , use another array

//We can try a new approach i.e for every element change the element at that index to negative
//if we find a negative idx then it is already visited i.e it is repeated
class duplicates
{
    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 6, 3, 6, 1};
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[Math.abs(arr[i])] < 0)
            {
                System.out.println(Math.abs(arr[i]));
            }
            else
            {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
        }
    }
}