package fundamentos.operadores;

import java.util.Scanner;

public class ExConceitosBasicos1e2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" informe a temperatura em fahrenheit para obter o resultado em celcius.");

		double tempFhren = entrada.nextDouble();
		double tempCelcius = (tempFhren  - 32) / 1.8;
		
		System.out.println(" A temperatura em celciuos é: " + tempCelcius);
		
		 System.out.println(" Digite a temperatura em ceucius para obter o resultado em fahrenheit");
		 tempCelcius = entrada.nextDouble();
		 tempFhren = (tempCelcius  * 1.8) + 32;
		 System.out.println(" A temperatura em fahrenheit é: " + tempFhren);

		entrada.close();

	}

}
