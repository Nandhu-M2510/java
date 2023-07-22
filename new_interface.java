import java.util.*;
interface drawable
{
	void draw();
	default void msg()
	{
		System.out.println("Default method");
	}
}
class rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
	class new_interface
	{
		public static void main(String args[])
		{
			drawable d=new rectangle();
			d.draw();
			d.msg();
		}
	}
	