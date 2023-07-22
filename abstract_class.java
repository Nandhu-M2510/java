import java.util.*;
abstract class bike
{
	abstract void run();
}
class abstract_class extends bike
{
	void run()
	{
		System.out.println("Running safely...");
	}
	public static void main(String args[])
	{
		bike obj=new abstract_class();
		obj.run();
	}
}