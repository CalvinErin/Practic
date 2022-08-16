package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
     GlobalVariable ss=new GlobalVariable();
     System.out.println("Super super class variable "+ss.a);
     C s=new C();
     System.out.println("Super class variable "+s.a);
     D f=new D();
     System.out.println("Sub class variable extends super super "+f.a);
     
   	}

}
