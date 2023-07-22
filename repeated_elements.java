import java.util.*;
class repeated_elements
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
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(count);
		System.out.print("Repeated elements are:");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("\n"+a[i]);
					
				}
			
			}
		}
	}
}
		
		