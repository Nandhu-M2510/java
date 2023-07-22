class monkey
{
        void jump()
		{
            System.out.println("jumping");
        }
        void bite()
		{
            System.out.println("biting");
        }
    }
interface basicanimal
{
    void eat();
    void sleep();
}
class human extends  monkey implements basicanimal
{
   public void eat(){
        System.out.println("eating");
    }
   public void sleep(){
        System.out.println("sleeping");
    }
}


public class ex3 
{
    public static void main(String[] args)
	{
		monkey m1= new human();
        m1.jump();
        m1.bite();
        basicanimal ba=new human();
        ba.eat();
        ba.sleep();
    }
}

