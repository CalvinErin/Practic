package logicalProgram;

import java.util.Scanner;

public class ReverseStringStudy {

	public static void main(String[] args) 
	{
	  //String s="Pune";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string");
		String s = sc.next();
	  
	  String r="";
	  
	  for(int i=s.length()-1;i>=0;i--)
	  {
		r=r+s.charAt(i);
	  }
	  System.out.println("Revers string of pune is "+r);

	}

}
