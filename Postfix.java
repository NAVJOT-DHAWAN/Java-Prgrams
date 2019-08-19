import java.util.*;
class Postfix
{
	
	static int evaluatePostfix(String s)
	{
		Stack<Integer>stack=new Stack<Integer>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
				stack.push(ch-'0');
			}
			
			else
			{
				int a=stack.pop();
				int b=stack.pop();
				
				switch(ch)
				{
					case '+':
					stack.push(b+a);
					break;
					case '-':
					stack.push(b-a);
					break;
					case '*':
					stack.push(b*a);
					break;
					case '/':
					stack.push(b/a);
					break;
				}
				
			}
		}
		return stack.pop();
	}
	
	public static void main(String arg[])
	{
		String s="53+2/43*-";
		System.out.println("Postfix Evaluation:- "+evaluatePostfix(s));
	}
}