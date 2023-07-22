import java.util.*;
class right_triangle_in_numbers
{
	public static void main(String args[])
	{
		int b=7;
		for(int i=0;i<b;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

					