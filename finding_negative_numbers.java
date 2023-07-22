import java.util.*;
class finding_negative_numbers
{
	public static void main(String args[])
	{
		finding_negative_numbers obj=new finding_negative_numbers();
	}
	finding_negative_numbers()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				count++;
			
			}
		}
		if(count!=0)
		{
			System.out.println(count);
			
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			
			}
		}
	}
}