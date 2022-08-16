package protedtedAccessSpeci;

import accessSpecifier.PrivateUse;

public class Sample extends PrivateUse{

	public static void main(String[] args) 
	{
     PrivateUse ac2=new PrivateUse();//created object of private class
     ac2.test2();
     System.out.println("==============================");
    Sample acc=new Sample();// created object of sample class
    acc.test2();
    acc.test3();// calling protected access specifier from another package with the help of inheritance
  

	}

}
