package controlStatement;

public class ElseIfAssign2 {

	public static void main(String[] args) {
		// If its summer then its very hot
		String season="rainy";
		if (season=="hot") 
		{
		System.out.println("If its summer then its very hot outside");	
		} 
		else if (season=="rainy") 
		{
			System.out.println("If its rainy then its raining heavely");
		}
		else if (season=="cold") 
		{
			System.out.println("If its winter then its so cold");
		}
		else 
		{
		System.out.println("Enter a valid season");
		}

	}

}
