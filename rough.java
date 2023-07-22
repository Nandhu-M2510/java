import java.util.*;
public class rough {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count=0;
		while(num1>0 && num2>0)
		{
			count++;
			if(num1<=num2) {
			num2=num2-num1;
		}
		else if(num1>=num2) {
			num1=num1-num2;
		}
		}
		System.out.print(count);
	}

}