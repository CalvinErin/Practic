package interfaceStudy;

public class ImpClass implements InterfaceUse {

	public static void main(String[] args) 
	{
    System.out.println(a);
    ImpClass i=new ImpClass();
    i.s1();
    i.s2();
    i.s3();
	}
	public void s3()
	{
		System.out.println("S3 own method of imp class");
	}
	@Override
	public void s1() {

System.out.println("Method s1 completed in implemetation class");
		
	}
	@Override
	public void s2() {
		System.out.println("Method s1 completed in implemetation class");
		
	}

}
