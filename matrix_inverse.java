import java.util.*;
class matrix_inverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		float a[][]=new float[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextFloat();
			}
		}
		float temp=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
		      if(i==0 && j==0)
		       {
			     temp=a[i][j];
				 a[i][j]=a[1][1];
				 a[1][1]=temp;
				 
			   }
			   else if(i!=j)
			   {
				   a[i][j]=0-a[i][j];
			   }
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		float det=((a[0][0]*a[1][1])-(a[0][1]*a[1][0]));
		System.out.println(det);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			a[i][j]=(a[i][j]/det);
			}
				
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}