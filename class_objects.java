import java.util.*;
class student
{
	int id;
	int age;
	String name;
	student(int a)
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
		student s1=new student(11);
		s1.id=111;
		s1.insert("Apple");
		s1.display();
}
}
	