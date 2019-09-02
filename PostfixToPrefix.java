import java.util.*;

class PostfixToPrefix
{
	static boolean isOperator(char x)
	{
		if(x=='+' || x=='-' || x=='*' || x=='/')
			return true;
		
		return false;
	}
	
	static String postToPre(String str)
	{
		Stack<String>stack=new Stack<String>();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			if(isOperator(str.charAt(i)))
			{
				String a = stack.pop();
				String b = stack.pop();
				String res = str.charAt(i) + b + a;
				stack.push(res);
			}
			
			else
			{
				stack.push(str.charAt(i) +"");
			}
		}
		
		return stack.peek();
	}
	public static void main(String arg[])
    {
		String s="ABC/-AK/L-*";
		System.out.println("Postfix to Prefix :- "+postToPre(s));
	}
}