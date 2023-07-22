import java.util.*;
class vowels_conversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int n=a.length();
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='i' || a.charAt(i)=='e' || a.charAt(i)=='o' || a.charAt(i)=='u')
				System.out.print(Character.toUpperCase(a.charAt(i)));
			else
				System.out.print(a.charAt(i));
		}
	}
}
				