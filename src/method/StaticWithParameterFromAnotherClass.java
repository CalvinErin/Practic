package method;

public class StaticWithParameterFromAnotherClass {

	public static void main(String[] args) 
	{
	test1("Navin", 2576, 68.8f, 'M');
     StaticWithParameterFromAnotherClass b=new StaticWithParameterFromAnotherClass();
     b.test2("Sagar", 38254);
	}
	//name, rollno, weight, gender
	public static void test1(String name, int rollno, float weight, char gender)
	{
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+rollno);
		System.out.println("My weight is "+weight);
        System.out.println("My Gender is "+gender);
        System.out.println("============================");
		

	}
	public void test2(String name, int rollno)
	{
	System.out.println("My name is "+name);
	System.out.println("My roll number is "+rollno);
	}
}
