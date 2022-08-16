package logicalProgram;

public class ReverseNumberWithoutStringConvert {

	public static void main(String[] args) 
	{
	  int number=1234;
	  int revNum=0;
	  
	  for(int i=number;i>0;i=i/10)
	  {
		int rem = i%10;
		revNum=revNum*10+rem;
	  }
System.out.println("Reverse number is "+revNum);
	}

}
