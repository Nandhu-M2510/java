import java.util.*;

class sequence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int a=sc.nextInt();
		
		for(int i=1;i<1000;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
			