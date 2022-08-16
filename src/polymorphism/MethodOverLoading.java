package polymorphism;

public class MethodOverLoading {

	public static void main(String[] args)
	{
     MethodOverLoading o=new MethodOverLoading();
     o.test(10, 5);
     o.test(8, 4, 2);

	}
	 public void test(int a, int b)
	  {
		 int add=a+b;
		 System.out.println("Sum of a and b is "+add);
	  }
	  public void test(int x, int y, int z)
	  {
		int add=x+y+z;
		System.out.println("Sum of x, y and z is "+add);
	  }

}
