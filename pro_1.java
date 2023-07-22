import java.util.*;
class pro_1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[n];
		int count=1;
		switch(count)
		{
			case 1:
			{
				c[0]=a[0]+b[0];
				System.out.print(c[0] );
				count++;
			}
			case 2:
			{
				c[1]=(a[1]*b[1])-2;
				System.out.print( " "+c[1]);
				count++;
			}
			case 3:
			{
				c[2]=a[2]*b[2];
				System.out.print(" "+c[2]);
				count++;
			}
			case 4:
			{
				c[3]=a[3]*b[3]+4;
				System.out.print(" "+c[3]);
				count++;
			}
			case 5:
			{
				c[4]=(a[4]*b[4])-5;
				System.out.print(" "+c[4]);
				count++;
		}
		}
		for(int i=0;i<n;i++)
		{
			if(c[i]<9)
			{
				System.out.println("S");
			}
		}
					
		
	}
}

		