import java.util.*;
 
 class fact
 {
	 public static void main(String args[])
	 {
		Scanner sc=new Scanner(System.in); 
		
		System.out.print("Enter a Number : ");
		
		int n =sc.nextInt();
		
		int factorial = 1;
		
		for(int i=1;i<=n;i++) 
		{
			factorial *= i;
		}
		
		System.out.print(n+"! = "+factorial);
	}
}