package logicalProgram;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) 
	{
	  //5!
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value");
		int number=sc.nextInt();
		int fact=1;
		
		for(int i=number;i>1;i--)
		{
	      fact=fact*i;
		}
		System.out.println("Factorial of 5 is "+fact);

	}

}
