import java.util.*;
class object
{
	int id;
	int age;
	String name;
	object(int a)
	{
		age=a;
	}
	void insert(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age+" ");
	}
	
    public static void main(String args[])
	{
		object s1=new object(11);
		s1.id=111;
		s1.insert("Apple");
		s1.display();
}
}
	