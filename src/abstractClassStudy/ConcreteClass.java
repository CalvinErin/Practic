package abstractClassStudy;

public class ConcreteClass extends Sample{

	public static void main(String[] args) 
	{
     ConcreteClass cc=new ConcreteClass();
     cc.t1();
     cc.t2();
     cc.t3();
     cc.t4();
     cc.t5();


	}
	public void t5()
	{
		System.out.println("Own conctrete class method");
	}
	@Override
	public void t3() 
	{
     System.out.println("Hi I am t3");		
	}
	@Override
	public void t4() 
	{
     System.out.println("Hi I am t4");

	}

}
