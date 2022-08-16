package basic;

public class NonStaticMethod {

	public static void main(String[] args) 
	{
     NonStaticMethod n=new NonStaticMethod();
    n.test();
    Demo1ForNonStatic ns=new Demo1ForNonStatic();
    ns.display1();

	}
	public void test()
	{
		int x;
		x=30;
		int y;
		y=20;
		int sum;
		sum=x+y;
		System.out.println("Addition of y and x is "+sum);
	}

}
