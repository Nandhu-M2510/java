import java.util.*;
 
 class check_integers
 {
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number :");
		 
		 int a=sc.nextInt();
		 
		 System.out.println("Enter 2nd Number :");
		 
		 int b=sc.nextInt();
		 
		 if(a==b)
		 {
			 System.out.println("The given numbers are equal");
		 }
		 else
		 {
			 System.out.println("The given numbers are not equal");
		 }
	 }
 }