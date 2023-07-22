import java.util.*;
class adding_even_position_numbers
{
	public static void main(String args[])
	{
		adding_even_position_numbers obj=new adding_even_position_numbers();
	}
	adding_even_position_numbers()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int arr[]=new int[n];
		for(int i=1;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if(i%2==0)
			{
				count+=arr[i];
			}
		}
		System.out.println(count);
	}
}
			