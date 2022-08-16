package constructorStudy;

public class UserDefined 
{
	// step 1--> declaration of variable 
	   
	int a;
	int b;
	int c;
	
	public UserDefined() // constructor without parameter 
	
	{
		a=10;
		b=20;
		c=30;
		
	}
	
	public UserDefined(int x)// Constructor with parameter
	{
		a=x;
	}
	
	public UserDefined(int x, int y)// Constructor with parameter
	{
		a=x;
		b=y;
	}
	
	public UserDefined(int x,int y, int z)// Constructor with parameter
	{
		a=x;
		b=y;
        c=z;	
	}
	public void add()
	{
		int add=a+b+c;
		System.out.println("Addition is "+add);
		System.out.println("=======================");
		
	}

	public static void main(String[] args) 
	{
		UserDefined ud=new UserDefined();
		ud.add();
		
		UserDefined ud1=new UserDefined(20);
		ud1.add();
				
		UserDefined ud3=new UserDefined(20, 30);
		ud3.add();
		
		UserDefined ud4=new UserDefined(40, 50, 60);
		ud4.add();
		
	}

}
