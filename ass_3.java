import java.util.*;
public class ass_3 
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
	    int	count=0;
        for(int i=0;i<n-1;i++)
			{
            for(int j=i+1;j<n;j++) 
			{
                int diff=a[i]-a[j];
                if (diff>count)
				{
                    count=diff;
				}
            }
        }
        System.out.print(count);
    }
}