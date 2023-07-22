import java.util.*;
class animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}
class dog extends animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
class babydog extends animal
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
class hierarchical
{
	public static void main(String args[])
	{
		babydog d=new babydog();
		d.eat();
		d.weep();
		dog s=new dog();
		s.bark();
		s.eat();
	}
}
