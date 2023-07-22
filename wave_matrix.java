import java.util.*;
class wave_matrix
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
		int rowmin=0;
		int rowmax=2;
		int colmin=0;
		int colmax=2;
		for(int i=rowmin;i<=rowmax;i++)
		{
			System.out.print(a[i][colmin]+" ");
		}
		for(int i=rowmax;i>=rowmin;i--)
		{
			System.out.print(a[i][colmin+1]+" ");
		}
		for(int i=rowmin;i<=rowmax;i++)
		{
			System.out.print(a[i][colmax]+" ");
		}
	}
}