package castingStudy;

public class Primitivesacting {

	public static void main(String[] args) 
	{  // Implicit casting 
       int a=10;// lower data type info
       System.out.println(a);
       double b=a;// No data loss take place
       System.out.println(b);// conv lower to higher
       System.out.println("======");
       // explicit casting
       double x=10.12;
       System.out.println(x);
       int y=(int) x;// data loss take place
       System.out.println(y);//conv higher to lower
       

	}

}
