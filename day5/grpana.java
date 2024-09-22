//Given a sequence of words, print all anagrams together | Set 1
// Input : {“cat”, “dog”, “tac”, “god”, “act”}
// Output : {“cat”, “tac”, “act”, ‘”dog”, “god”}

import java.util.*;
class grpana
{
    public static void main(String args[])
    {
        String[] arr= {"cat", "dog", "tac", "god", "act"};
        HashMap<String , ArrayList<String>> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            char[] temp1 = arr[i].toCharArray();
            Arrays.sort(temp1);
            String temp = new String(temp1);

            if(map.containsKey(temp))
            {
                map.get(temp).add(arr[i]);
            }
            else
            {
                ArrayList<String> al = new ArrayList<>();
                al.add(arr[i]);
                map.put(temp,al); 
            }
        }

        Set ks = map.keySet();
        for(Object k : ks)
        {
            for(int i = 0 ; i < map.get(k).size() ; i++)
            {
                System.out.print(map.get(k).get(i)+" ");
            }
            System.out.println();
        }
    }
}

//instead of sorting everytime u can use other hashmap inorder to check the count of the chars
//HashMap<HashMap ,ArrayList> outer hashmap is used to store the arraylist of anagrams inner hasmap is used for checking the count of the particular string

//the code above has O(mnlogn);
//here hm of hm code has O(mn) tc and O(mn) sc