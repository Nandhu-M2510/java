import java.util.*;
class k_pattern_in_numbers
{
	public static void main(String args[])
	{
		int n=7,count=1;
		for(int i=1;i<n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			count=1;
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
			count=1;
		}
	}
}