import java.util.*;
class infixtoPostfix
{
    public static String toPost(String str , HashMap<Character,Integer> map)
    {
        StringBuilder res = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        boolean flag = false;
        StringBuilder s = new StringBuilder("");

        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= '1' && str.charAt(i) <= '9')
            {
                if(flag == true)
                {
                    s.append(str.charAt(i));
                }
                else
                {
                    res.append(str.charAt(i));
                }
            }
            else if(str.charAt(i) == '(')
            {
                flag = true;
                stack.push('(');
            }
            else if(str.charAt(i) == ')')
            {
                flag = false;
                while(!stack.isEmpty() && stack.peek() != '(')
                {
                   s.append(stack.pop());
                   //stack.push(s.toString());
                }
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                res.append(s);
                s.setLength(0);
            }                    
            
            else
            {
                if(stack.isEmpty() || stack.peek() == '(' || map.get(stack.peek()) < map.get(str.charAt(i)))
                {
                    stack.push(str.charAt(i));
                }
                else
                {

                    if(flag == true)
                    {
                        while(!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) >= map.get(str.charAt(i)))
                        {
                            s.append(stack.pop());
                        }
                    }
                    else
                    {
                        while(!stack.isEmpty() && stack.peek() != '(' && map.get(stack.peek()) >= map.get(str.charAt(i)))
                        {
                            res.append(stack.pop());
                        }
                    }
                    stack.push(str.charAt(i));
                }
            }
        }
        while(!stack.isEmpty())
        {
            res.append(stack.pop());
        }

        return res.toString();
    }

    public static void main(String args[])
    {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('+',0);
        map.put('-',0);
        map.put('*',1);
        map.put('/',1);
        map.put('^',2);
        map.put('(',3);
        map.put(')',3);

        toPost(str,map);
        System.out.println();

    }
}