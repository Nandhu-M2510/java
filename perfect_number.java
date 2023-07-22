import java.util.*;
class perfect_number
{
	public static void main(String args[])
	{
		perfect_number obj=new perfect_number();
	}
	perfect_number()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,count=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				count=count+i;
			}
		}
		if(count==n)
		{
		System.out.println("It is a perfect number");
		}
		else
		{
		System.out.print("It is not a perfect number");
		}
	}
}