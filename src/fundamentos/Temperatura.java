package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// (� F - 32) * 5 / 9 = � C
		final double FATOR = 5.0 / 9.0;
		final double AUSTE = 32;
		
		double fahrenheit = 86;
		double celsius = (fahrenheit - AUSTE) * FATOR;
		System.out.println(" O resiltado � " + celsius + " � C. ");
		
		fahrenheit = 150;
		celsius = (fahrenheit - AUSTE) * FATOR;
		System.out.println(" O resultado � " + celsius + " � C. ");
	}

}
