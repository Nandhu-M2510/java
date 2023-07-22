import java.util.*;
interface printable
{
	void print();
}
class abstraction implements printable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		abstraction obj=new abstraction();
		obj.print();
		
	}
}