import java.util.*;
class problem_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			 arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(min>=arr[i])
			{
				min=arr[i];
			}
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(min!=arr[i])
			{
				int value=arr[i]-min;
				sum+=value;
			}
			else
			{
				continue;
			}
		}
		System.out.print(sum);

		
	}
}
		