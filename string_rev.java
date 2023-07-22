import java.util.*;
class string_rev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] ch=str.split(" ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.printf("%s ",ch[i]);
		}
	}
}