import java.util.*;
class searching
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		int s=3;
		int j=0;
		for(int i=s;i<n;i++)
		{
			b[j]=a[i];
			j=j+1;
		}
		for(int i=0;i<s;i++)
		{
			b[j]=a[i];
			j=j+1;
		}
		int target=sc.nextInt();
		int count=0;
		int value=0;
		for(int i=0;i<n;i++)
		{
			if(b[i]==target)
			{
				count=1;
				value=i;
			}
		}
		if(count==1)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println("-1");
		}
	}
}