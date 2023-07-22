import java.util.*;
class count_of_all_characters
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] b=new String[]{a};
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]!=b[j])
				{
					String[] n=b.split();
				}
			}
			System.out.println(n[i]);
		}
		
	}
}