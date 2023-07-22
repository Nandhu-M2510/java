
import java.util.Scanner;
public class vowels 
{

	public static void main(String[] args)
	{
	
		Scanner ran=new Scanner(System.in);
		String s=ran.next();
		char b=' ';
		char ch[]=s.toCharArray();
		int i,n=s.length();
		for(i=0;i<n;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=b;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.print(ch[i]);
		}
	}

}