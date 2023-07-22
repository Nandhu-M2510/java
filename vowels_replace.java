import java.util.*;
class vowels_replace
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		a=a.replace('a','*');
		a=a.replace('e','*');
		a=a.replace('i','*');
		a=a.replace('o','*');
		a=a.replace('u','*');
		System.out.print(a);
	}
}
		
		
		
	