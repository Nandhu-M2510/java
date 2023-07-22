import java.util.*;

class algorithm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int a=sc.nextInt();
		int b[];
		int b[0]=1;
		int b[1]=1;
		for(int i=0;i<a;i++)
		{
		    for(int j=i+1;j++)
			{
				int temp=i;
				i=i+j;
				System.out.println(b[i]);
		}
	}
}