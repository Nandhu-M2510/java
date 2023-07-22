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
class babydog extends dog
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}
class multilevel
{
	public static void main(String args[])
	{
		babydog d=new babydog();
		d.eat();
		d.bark();
		d.weep();
	}
}
