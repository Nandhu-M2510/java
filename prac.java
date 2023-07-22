import java.util.*;
class prac
{
	public static void main(String args[])
	{
int a[]={1,2,3,2};
int sum=0;
for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j])
		{
			a[i]=0;
			a[j]=0;
		}
		
	}
}
for(int i=0;i<a.length;i++)
{
	sum+=a[i];
	System.out.print(sum);
	
	}
}
}