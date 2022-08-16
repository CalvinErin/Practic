package logicalProgram;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		// 1234-->4321
		int number=1234;
		String s = Integer.toString(number);
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
		  r=r+s.charAt(i);
		}
		int RevNum = Integer.parseInt(r);
		
		System.out.println("Original number is "+number);
		
		System.out.println("Reverse Number is "+RevNum);

	}

}
