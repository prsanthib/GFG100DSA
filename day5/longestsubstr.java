// find the length of longest substring without repeating characters

import java.util.*;
class longestsubstr
{
    public static void main(String args[])
    {
        String str = "ABCDBCET";
        int temp[] = new int[26];
        int l = 0;
        int r = 0;
        int maxlen = 0;
        while(r < str.length())
        {
            if(temp[str.charAt(r)-'A']!=1)
            {
                temp[str.charAt(r)-'A'] = 1;
                maxlen = Math.max(r-l+1,maxlen);
                r++;                
            }
            else
            {
                while(temp[str.charAt(r)-'A'] == 1)
                {
                    temp[str.charAt(l)-'A'] = 0;
                    l++;
                }
                maxlen = Math.max(r-l+1,maxlen);
            }
        }
        System.out.println(maxlen);
    }
}