import java.util.*;
class PostfixToInfix
{
	static boolean isOperand(char x)
	{
		return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z');
	}
	static String evaluatePostfix(String s)
	{
		Stack<String>stack=new Stack<String>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(isOperand(ch))
			{
				stack.push(ch +" ");
			}
			
			else
			{
				String a=stack.pop();
				String b=stack.pop();
				
				stack.push("( " +b +ch +" "+a +" ) ");
				
			}
		}
		return stack.pop();
	}
	
	public static void main(String arg[])
	{
		String s="AB+C/DE*-";
		System.out.println("Postfix to Prefix Evaluation:- "+evaluatePostfix(s));
	}
}