import java.util.*;
class matrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int count=0,temp=0,value=0;
		for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(a[i][j]==1)
					{
						count++;
					}
				}
				if(count>before)
				{
					temp=count;
					value=i+1;
				}
				count=0;
			}
			System.out.println(value);
			
			
	
	}
	
}