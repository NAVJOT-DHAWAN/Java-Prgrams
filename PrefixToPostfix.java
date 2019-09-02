import java.util.*;

class PrefixToPostfix
{
	static boolean isOperator(char x)
	{
		if(x=='+' || x=='-' || x=='*' || x=='/')
			return true;
		
		return false;
	}
	
	static String preToPost(String s)
	{
		Stack<String>stack=new Stack<String>();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			if(isOperator(s.charAt(i)))
			{
				String a=stack.pop();
				String b=stack.pop();
				
				String res=a+b+s.charAt(i);
				
				stack.push(res);
			}
			
			else
			{
				stack.push(s.charAt(i)+"");
			}
		}
		
		return stack.peek();
	}
	public static void main(String arg[])
	{
		String s="*-A/BC-/AKL";
		System.out.println("Prefix to Postfix :- "+preToPost(s));
	}
}