import java.util.*;
interface printable
{
	void print();
}
interface showable
{
	void show();
}
class interface_ex implements printable,showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String args[])
	{
		interface_ex obj=new interface_ex();
		obj.print();
		obj.show();
	}
}
