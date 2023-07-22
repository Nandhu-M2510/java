import java.util.*;

class multiplication_of_digits
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		
		int a=sc.nextInt();
		
		int rev=1,temp;

        while (a!=0) 
		{
            temp=a%10;
            rev=rev*temp;
            a=a/10;
        }
		System.out.println("Multiplication of the Digits are : "+rev);
	}
}