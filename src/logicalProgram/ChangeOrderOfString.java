package logicalProgram;

public class ChangeOrderOfString {

	public static void main(String[] args) 
	{
	  String name="I Love My India";
	  String ar[]=name.split(" ");
	  
	  for(int i=0;i<=ar.length-1;i++)
	  {
		if (i%2!=0)//i==0 for even index position 
		{
		 String s=ar[i];
		 ar[i]=RevString(s);
		}
	  }
	  for(int i=0;i<=ar.length-1;i++)
	  {
	    System.out.println(ar[i]+"");
	  }

	}
	public static String RevString(String input)
	{
      String rev="";
      for(int i=input.length()-1;i>=0;i--)
      {
    	  rev=rev+input.charAt(i);
      }
    return rev;
	}

}
