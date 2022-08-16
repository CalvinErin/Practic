package method;

public class StaticWithParameter {

	public static void main(String[] args)
	{
		
     Demo("Suraj", 41295, 50.5f, 'M');
     Demo("Sumit", 6, 50f, 'M');
     
     StaticWithParameterFromAnotherClass.test1("Vijay", 5462, 55f, 'M');
     
	}
	
	// name, rollno, weight, gender
	public static void Demo(String name, int rollno, float weight, char gender)
	{
		
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+rollno);
		System.out.println("My weight is "+weight);
        System.out.println("My Gender is "+gender);
        System.out.println("============================");
        
	}

}
