import java.util.Scanner;

public class disarium_number 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sum = 0;
        int digitCount = 0;
        int digits[] = new int[100];

        while (number > 0) {
            digits[++digitCount] = number % 10;
            number /= 10;
        }

        for (int i = 1; i <= digitCount; i++)
			{
            sum += Math.pow(digits[i], i);
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is a Disarium Number");
        } else {
            System.out.println(originalNumber + " is not a Disarium Number");
        }
    }
}
