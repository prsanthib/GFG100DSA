//longest palindromic substring
//Given a string str, the task is to find the longest substring which is a palindrome. If there are multiple answers, then return the first appearing substring.
//Input: str = “forgeeksskeegfor” 
//Output: “geeksskeeg”

// we are using manachers algorithm

import java.util.*;
class longestPS
{
    public static String preprocess(String s)
    {
        StringBuilder sc = new StringBuilder("^#");
        for(int i = 0 ; i < s.length() ; i++)
        {
            sc.append(s.charAt(i)).append("#");
        }
        sc.append("$");

        return sc.toString();
    }

    public static String util(String st)
    {
        String str = preprocess(st);
        int p[] = new int[str.length()];

        int c = 0;
        int s = 0;
        int ml = 0;
        int r = 0;

        for(int i = 0 ; i < str.length() ; i++)
        {
            int mirror = 2*c-i;

            if(i < r)
            {
                p[i] = Math.min(r-i , p[mirror]);
            }
            //expand edges
            
            int a = i+1+p[i];
            int b = i-1+p[i];

            while(a < str.length() && b >= 0 && str.charAt(a) == str.charAt(b))
            {
                p[i]++;
                a++;
                b--;
            }

            //if it expands beyond right
            if(i+p[i] > r)
            {
                c = i;
                r = p[i]+i;
            }

            //update maxlen
            if(p[i] > ml)
            {
                ml = p[i];
                s = (i-ml)/2;
            }
            
        }

        return st.substring(s,s+ml);
    }

    public static void main(String args[])
    {
        String str = "abbababa";
        System.out.println(util(str));
    }
}