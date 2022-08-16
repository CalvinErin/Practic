package logicalProgram;

public class PrimeNumber {

	public static void main(String[] args) 
	{
	  int number=17;
	  int counter=0;
	  
	  for(int i=2;i<number;i++)
	  {
		if(number%i==0)
		{
		  counter++;
		  break;
		}
	  }
	  if(counter==1)
	  {
		System.out.println("Given number is not prime number");
	  }
	  else {
		System.out.println("Given number is prime number");
	}

	}

}
