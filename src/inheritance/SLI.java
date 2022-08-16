package inheritance;

public class SLI {

	public static void main(String[] args) {
		// calling global variable with the help of extends
		GlobalVariable a=new GlobalVariable();
	BPart b=new BPart();
	System.out.println("Global variable a is "+a.a);
	System.out.println("GlobalVpart b is "+b.b);
	System.out.println("Global variable b extends global variable a is "+b.a);

	}

}
