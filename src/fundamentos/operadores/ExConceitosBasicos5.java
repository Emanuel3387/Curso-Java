package fundamentos.operadores;

import java.util.Scanner;

public class ExConceitosBasicos5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Informe o valor da base do triangulo ");
		double base = entrada.nextDouble();
		
		System.out.println(" Informe o valor da altura do triangulo ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura) / 2;
		System.out.println(" A area do triangulo é: " + area);
		
		entrada.close();
	}

}
