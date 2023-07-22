import java.util.*;
public class arraylist_traverse
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();
al.add("Abishek");
al.add("Ammu");
al.add("Prabha");
al.add(1,"Pragya");
System.out.println("Element at 2nd position: "+al.get(2));
ListIterator<String> itr=al.listIterator();
System.out.println("Traversing elements in forward direction...");
while(itr.hasNext())
{
System.out.println(itr.next());
}
System.out.println("Traversing elements in backward direction...");
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
}
}