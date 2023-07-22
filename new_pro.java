import java.util.*;
class new_pro
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
		int count = 0;
        for (int i = 0; i < n; i++) 
		{
            if (a[i] == 0)
				{
                  a[i]=1;
                for (int j=i+1;j<n;j++)
					{
                    if (a[j]==1) 
					{
                        a[j] = 0;
                    }
                    else {
                        a[j] = 1;
                    }
                }
                count++;
            }
        }
		System.out.println(count);
	}
}
		