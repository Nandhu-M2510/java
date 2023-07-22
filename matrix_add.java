import java.util.*;
class matrix_add
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
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==1 && j==1)
				{
					System.out.print(a[i][j]+"\t");
				}
				else if(i==1 || j==1)
				{
					System.out.print("* \t");
				}
				else
				{
					a[i][j]=5+a[i][j];
					System.out.print(a[i][j]+"\t");
				}
			}System.out.print("\n");
		}
		
}
}
		