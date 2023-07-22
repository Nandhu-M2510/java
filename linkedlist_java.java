import java.util.*;
class linkedlist_java
{
	public static void main(String args[])
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.addLast("makes");
		ll.add("many");
		ll.addFirst("Money");
		ll.add("things");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.set(2,"any");
		System.out.println(ll);
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		for(String s:ll)
		{
			System.out.print("\n"+s+" ");
		}
		System.out.println(ll);
		Object[] a =ll.toArray();
		for(Object element:a)
		{
			System.out.println(element+" ");
		}
		System.out.println(ll.size());
		
	}
}
		