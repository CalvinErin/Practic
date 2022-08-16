package method;

public class NonStaticStudy {

	public static void main(String[] args)
	{
     NonStaticStudy n=new NonStaticStudy();
     n.t1();
	NonStaticStudy n1=new NonStaticStudy();
	NonStaticStudy p=new NonStaticStudy();
	n1.t2();
	Simple1 n2=new Simple1();
	n2.m3();
	p.info("Shubham", 'M', 9, 59.8f);
	}
   public void t1()
   {
	   int b;
	   int a;
	   int add;
	   a=5;
	   b=8;
	   add=a+b;
	   System.out.println("Addition is "+add);
	   System.out.println("======================");
   }
 
    public void t2()
  
   {
	String name;
	name="Neha";
	String DOB;
	DOB="14 May 2000";
	char gender;
	gender='F';
	float weight;
	weight=48.99f;
	float height;
	height=5.3f;
	String edu;
    edu="BCA";
	String status;
	status="Single";
	System.out.println("============================");
	System.out.println("My name is "+name);
	System.out.println("My date of birth is "+DOB);
	System.out.println("My gender is "+gender);
	System.out.println("My weight is "+weight);
	System.out.println("My height is "+height);
	System.out.println("My education is "+edu);
	System.out.println("My status is "+status);
	System.out.println("============================");
   } 
     // name, gender, rollno,weight
    public void info(String name, char gender, int rollno, float weight)
    {
    

    	System.out.println("============================");

    	System.out.println("My name is "+name);
    	System.out.println("My gender is "+gender);
    	System.out.println("My weight is "+rollno);
    	System.out.println("My height is "+weight);
    	System.out.println("============================");
        
    	
   
    }
    
}
