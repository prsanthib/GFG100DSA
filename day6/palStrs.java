// count of palindromic substrings in a string
// using center expand method

import java.util.*;
class palStrs
{
    public static int count(String str)
    {
        int ec = 0;
        int oc = 0;
        //consider every ele as centre and expand it
        for(int i = 0 ; i < str.length() ; i++)
        {
            //for odd centres
             oc += expand(str,i,i);

            //for even centers
             ec += expand(str,i,i+1);
        }

        return oc+ec;
    }

    public static int expand(String s , int l , int r)
    {
        int c = 0;
        while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r))
        {
            c++;
            l--;
            r++;
        }
        return c;
    }

    public static void main(String args[])
    {
        String str = "ababa";
        System.out.println(count(str));
    }
}