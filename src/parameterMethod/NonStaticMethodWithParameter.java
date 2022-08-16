package parameterMethod;

public class NonStaticMethodWithParameter {

	public static void main(String[] args) {
		// name, rollnum, gender and weight
      NonStaticMethodWithParameter p=new NonStaticMethodWithParameter();
    		  p.t("Simple", 2554, 'G', 65.2f);// calling non static method with parameter from same class
      NonSMethodWithPDiffC p1=new NonSMethodWithPDiffC();
      p1.t1("Simple1", 1524, 'H', 70.5f);
	}
	public void t(String name, int rollnum, char gender, float weight )
	{
		System.out.println("My name is "+name);
		System.out.println("My Roll number is "+rollnum);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight);
		System.out.println("=================================");
}

}
