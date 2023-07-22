import java.util.*;
class area
{
	int height;
	int width;
	int depth;
}
class area_of_box
{
	public static void main(String args[])
	{
		area myarea=new area();
		int ans;
		myarea.height=10;
		myarea.width=15;
		myarea.depth=20;
		ans=myarea.height*myarea.width*myarea.depth;
		System.out.print("Ans is:"+ans);
	}
}
