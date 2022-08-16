package logicalProgram;

public class WhilteSpaceFromString {

	public static void main(String[] args) 
	{
	  String s="I love my India";
	  int counter=0;
	  
	  for(int i=0;i<=s.length()-1;i++)
	  {
		char blank = s.charAt(i);
		if(blank==' ')
		{
	     counter++;
		}
	  }
      System.out.println("Blank space present in " + s + counter);
	}

}
