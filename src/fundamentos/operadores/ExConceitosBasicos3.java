package fundamentos.operadores;

import java.util.Scanner;

public class ExConceitosBasicos3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Infomme seu peso. ");
		double peso = entrada.nextDouble();
		
		System.out.println(" Informe sua altura. ");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.println("O seu IMC é: " + imc );
		
		entrada.close();

	}

}
