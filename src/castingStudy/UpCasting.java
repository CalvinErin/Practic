package castingStudy;

public class UpCasting {

	public static void main(String[] args) 
	{
     SubClass sub1=new SubClass();
     sub1.honesty();
     sub1.atitude();
     System.out.println("==========================");
     SuperClass sub=new SubClass();
     sub.honesty();

	}

}
