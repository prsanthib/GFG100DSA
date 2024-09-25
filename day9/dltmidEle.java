// delete middle elemen from java 
import java.util.*;
class dltmidEle
{
    public static void dltMid(Stack<Character> stack,double n)
    {
        if(n == 0)
        {
            stack.pop();
            return ;
        }
        char data = stack.pop();
        dltMid(stack , n-1);
        stack.push(data);
        
    }

    public static void main(String args[])
    {
        Stack<Character> st = new Stack<Character>();
     
        st.push('1');
        st.push('2');
        // st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');
        
        double d = st.size()/2;
        double n = Math.ceil(d);
        dltMid(st,n);
        //print stack
        while(!st.isEmpty())
        {
            System.out.print(st.pop()+" ");
        }
        System.out.println();
        
    }
}