import java.util.*;
class water_trap
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
	    int max = 0;
		for (int i = 0; i < n ; i++)
		{
			int val=a[i]*(n-i-2);
			if(val>max)
			max=val;
		}
	}
}