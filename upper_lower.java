import java.util.*;
 class upper_lower
 {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
	String inputString=sc.nextLine();
    String[] words = inputString.split("\\s+");
    String outputString = "";
    for (String word : words)
		{
      String firstLetter = word.substring(0, 1).toUpperCase();
      String restLetters = word.substring(1).toLowerCase();
      outputString += firstLetter + restLetters + " ";
    }
    System.out.println(outputString);
  }
}
