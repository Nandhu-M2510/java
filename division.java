import java.util.*;
class division
{
public static void main(String args[])
{
	int n=20;
	for(int i=1;i<=n;i++)
	{
	    if(i%3==0 && i%5==0)
		{
			System.out.println("fizz buzz");
		}
		else if(i%3==0)
		{
			System.out.println("fizz");
		}
		else if(i%5==0)
		{
			System.out.println("buzz");
		}
		
		else
		{
			System.out.println(i);
		}
	}
}
}
		