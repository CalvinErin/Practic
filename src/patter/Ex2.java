package patter;

public class Ex2 {

	public static void main(String[] args) 
	{
	 //*
	 //**
	 //***
	 //****
 //rows-->4 cell(min)-->1 star=1
		int star=1;
		for(int i=0;i<=4;i++)
		{
		 for(int j=1;j<=star;j++)
		 {
		  System.out.print("*");
		 }
		 star++;
		 System.out.println();
		}

	}

}
