import java.util.*;
class insertAndsearchInTrie
{
    static class TrieNode
    {
        TrieNode[] child = new TrieNode[26];
        int endofWord = 0;
    }

    public static void insert(TrieNode root , String str)
    {
        TrieNode temp = root;

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(temp.child[str.charAt(i)-'a'] != null)
            {
                temp = temp.child[str.charAt(i)-'a'];
                continue;
            }
            temp.child[str.charAt(i)-'a'] = new TrieNode();
            temp =  temp.child[str.charAt(i)-'a'] ;
        }

        temp.endofWord = 1;
    
    }

    public static boolean search(TrieNode root , String str)
    {
        TrieNode temp = root;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(temp.child[str.charAt(i)-'a'] != null)
            {
                temp = temp.child[str.charAt(i)-'a'];
            }
            else
            {
                return false;
            }
        }
        if(temp.endofWord == 1)
        {
            return true;
        }

        return false;
    }   

    public static void main(String args[])
    {
        List<String> al = Arrays.asList("star","soap","mern","santoor","sakshi");

        TrieNode root = new TrieNode();
        for(int i = 0 ; i < al.size() ; i++)
        {
            insert(root,al.get(i));
        }
    
        System.out.println(search(root,"sakshi"));
    }
}