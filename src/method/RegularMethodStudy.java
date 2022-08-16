package method;

public class RegularMethodStudy {

	public static void main(String[] args) 
	{
    Demo();  //Ex.1 static method from same class
    
    Demo1();  //Ex.2 static method from same class
    test();   //Ex.3 static method from same class
    
    Sample.sample1();  //static method from another class
    Sample.sample2();
	}
	
	public static void Demo() //Ex.1 static method from same class
	{
	// variable declaration
		int a;
		int b;
		int add;
		
		a=10;
		b=20;
		add=a+b;
		
		System.out.println("Addition is "+add);
		
	
	}
	
	public static void Demo1()  //Ex.2 static method from same class
	{
	// variable declaration
		int x;
		int y;
		int sub;
		
		x=50;
		y=20;
		sub=x-y;
		
		System.out.println("Substraction is "+sub);
		
	
	}
	
	public static void test() //Ex.3 static method from same class
	{
	int n;
	int m;
	int mult;
	n=15;
	m=25;
	mult=n*m;
	System.out.println("Multiplication is "+mult);
	
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
