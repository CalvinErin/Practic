package logicalProgram;

import java.util.Scanner;

public class PalindromStudy {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter your string value");
	  String s=sc.next();
	  
	  String rp="";
	  
	  for(int i=s.length()-1;i>=0;i--)
	  {
	    rp=rp+s.charAt(i);
	  }
	  {
	  if (s.equals(rp)) 
	  {
	   System.out.println("My string is palindrom");
	  }
	  else 
	  {
		System.out.println("My string is not palindrom");
	  }
	}

}
}