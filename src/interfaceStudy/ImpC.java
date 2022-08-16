package interfaceStudy;

public class ImpC implements A,B{

	public static void main(String[] args) 
	{
     ImpC in=new ImpC();
     in.iphone();
     in.oneplus();
     in.samsung();
     in.redme();
     in.Motorola();


	}

	@Override
	public void samsung() 
	{
	 System.out.println("samsung is property of interface class B");		
	}

	@Override
	public void redme() 
	{
		System.out.println("redme is property of interface class B");	
	}

	@Override
	public void iphone() 
	{
		System.out.println("iphone is property of interface class A");	
	}

	@Override
	public void oneplus() 
	{
		System.out.println("oneplus is property of interface class A");	
	}
public void Motorola()
{
System.out.println("Motorola is its own property of ImpC class");	
}
}
