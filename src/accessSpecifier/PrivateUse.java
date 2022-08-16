package accessSpecifier;

public class PrivateUse {

	public static void main(String[] args)
	{
     PrivateUse ac=new PrivateUse();
     ac.test();
     ac.test1();
     ac.test2();
     ac.test3();

		
	}
	private void test()
	{
		System.out.println("Private access specifier test");
	}
    void test1()
    {
    	System.out.println("Default access specifier test1");
    }
    public void test2()
    {
    	System.out.println("Public access specifier test2");
    }
    protected void test3()
    {
    	System.out.println("Protected access specifier test3");
    }
}
