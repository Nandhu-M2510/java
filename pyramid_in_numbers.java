
import java.util.*;

class pyramid_in_numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int s=n;s>i;s--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int l=i-1;l>=1;l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
