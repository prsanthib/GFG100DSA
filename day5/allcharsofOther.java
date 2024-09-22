//Smallest window in a String containing all characters of other String
// Given two strings S (length m) and P (length n), the task is to find the smallest substring in S that contains all characters of P, including duplicates. If no such substring exists, return “-1”. If multiple substrings of the same length are found, return the one with the smallest starting index.

// S = “timetopractice”, P = “toc”
// Output: toprac

import java.util.*;
class allcharsofOther
{
    static int minlen = Integer.MAX_VALUE;
    static String str= "";
    public static void util(String s1 , String s2 , HashMap<Character,Integer> map1 , HashMap<Character,Integer> map2)
    {
        for(int i = 0 ; i < s2.length() ; i++)
        {
            map1.put(s2.charAt(i),map1.getOrDefault(s2.charAt(i),0)+1);
        }

        HashMap<Character,Integer> temp = new HashMap<>(map1);
        int s = 0;
        int e = 0;
        int minlen = Integer.MAX_VALUE;


        int i = 0;
        while(map1.size() != 0)
            {
                if(i == s1.length() || e == s1.length())
                {
                    System.out.println("-1");
                    return ;
                }
                map2.put(s1.charAt(i),map2.getOrDefault(s1.charAt(i),0)+1);
                if(map1.containsKey(s1.charAt(i)))
                {
                    map1.put(s1.charAt(i),map1.get(s1.charAt(i))-1);
                    if(map1.get(s1.charAt(i)) == 0)
                    {
                        map1.remove(s1.charAt(i));
                    }
                }
                i++;
                e++;
            }

            if(e<s1.length() && s<=e && e-s+1 < minlen)
            {
                minlen = e-s+1;
                str = s1.substring(s,e);
            }

        while(e < s1.length())
        {
            while(!temp.containsKey(s1.charAt(s)) || map2.get(s1.charAt(s)) > temp.get(s1.charAt(s)))
            {
                map2.put(s1.charAt(s),map2.get(s1.charAt(s))-1);
                if(map2.get(s1.charAt(s)) == 0)
                {
                    map2.remove(s1.charAt(s));
                } 

                s++;

                if(e-s+1 < minlen)
                {
                    minlen = e-s+1;
                    str = s1.substring(s,e);
                }
            }

            
            map2.put(s1.charAt(s) , map2.get(s1.charAt(s))-1);
            if(map2.get(s1.charAt(s)) == 0)
            {
                map2.remove(s1.charAt(s));
            }
            //s++;
            e++;
            while(e<s1.length() && s1.charAt(e) != s1.charAt(s))
            {
                if(e >= s1.length())
                {
                    break;
                }
                map2.put(s1.charAt(e) , map2.getOrDefault(s1.charAt(e),0)+1);
                e++;
                i++;
            }      
            s++;
            if(e<s1.length() && e-s+1 < minlen)
            {
                minlen = e-s+1;
                str = s1.substring(s,e);
            }      
        }
    }

    public static void main(String args[])
    {
        String s1 = "potimetopravectice";
        String s2 = "pov";

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        util(s1,s2,map1,map2);
        System.out.println(str);
    }
}