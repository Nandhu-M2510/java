import java.util.*;
class grandfather
{
	void show()
	{
		System.out.println("I am grandfather..");
	}
}
class father extends grandfather
{
	void bark()
	{
		System.out.println("I am father...");
	}
}
class son extends father
{
	void weep()
	{
		System.out.println("I am son...");
	}
}
class daughter extends father
{
	void cry()
	{
		System.out.println("I am daughter...");
	}
}
class hybrid
{
	public static void main(String args[])
	{
		daughter d=new daughter();
		d.cry();
		d.bark();
		d.show();
	
	}
}
