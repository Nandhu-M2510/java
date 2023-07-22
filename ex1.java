abstract class AbstractClass 
{
    AbstractClass() 
	{
        System.out.println("This is constructor of abstract class");
    }
    
    abstract void aMethod();
    
    void normalMethod()
	{
        System.out.println("This is a normal method of abstract class");
    }
}

class SubClass extends AbstractClass 
{
    void aMethod()
	{
        System.out.println("This is abstract method");
    }
}

public class ex1
 {
    public static void main(String[] args) 
	{
        SubClass subClassObj = new SubClass();
        subClassObj.aMethod();
        subClassObj.normalMethod();
    }
}
