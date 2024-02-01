package LinkedList.stack;
import java.util.*;
public class balanceParanthesis 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++)
    {
        if(st.isEmpty())
        {
            st.push(s.charAt(i));
        }
        else if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
        {
             st.push(s.charAt(i));
        }
        else if(s.charAt(i)==')' && st.peek()=='(')
        {
            st.pop();
        }
        else if(s.charAt(i)==']' && st.peek()=='[')
        {
            st.pop();
        }
        else if(s.charAt(i)=='}' && st.peek()=='{')
        {
            st.pop();
        }
        else
        {
            st.push(s.charAt(i));
        }
    }
    if(st.isEmpty())
    {
        System.out.println("Balanced");
    }
    else
        {
            System.out.println("Not Balanced");
        }
    
    }

}
