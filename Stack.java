import java.util.ArrayList;
import java.util.*;

public class Stack 
{  
public static void main(String[] args)   
{  
java.util.Stack<Integer> stk = new java.util.Stack<> ();
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120);  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result); 
stk.pop(); 
System.out.println(stk.peek());
System.out.println(stk.search(78));
System.out.println(stk.size());
stk.sort(null);
System.out.println(stk);
}  
} 