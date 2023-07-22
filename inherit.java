import java.util.*;
class value
{
	int a;
	int b;
	void get(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class add extends value
{
	void sum()
	{
		int c=a+b;
		System.out.println("sum="+c);
	}
}
class inherit
{
	public static void main(String args[])
	{
		add d=new add();
		d.get(10,15);
		d.sum();
	}
}