package variableTypes;

public class GlobalAndLocalVariable {
   int x=10;
   static int y=5;
	public static void main(String[] args)
	{
    GlobalAndLocalVariable s=new GlobalAndLocalVariable();
    s.test();
    test0();
    System.out.println("Global value of x is "+s.x);
    System.out.println("Local value of y is "+y);
    SampleForGALV s1=new SampleForGALV();
    System.out.println("Local value of static V from another class q is "+SampleForGALV.q);
    System.out.println("Global value of non static V from another class p is "+s1.p);
	}
 public void test()
 {
	 int a=10;
	 int sum=a+10;
	 System.out.println("Addition of non-static is "+sum);
 }
 public static void test0()
 {
	 int b=5;
	 int sum=5+b;
	 System.out.println("Addition of static "+sum);
 }
}
