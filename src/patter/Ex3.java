package patter;

public class Ex3 {

	public static void main(String[] args)
	{
	 //****
	 //***
	 //**
	 //*
	//row-->4 cell-->4 star-->4
		int star=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=star;j++)
			{
			 System.out.print("*");
			}
			star--;
			System.out.println();
		}

	}

}
