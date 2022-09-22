package fundamentos.operadores;

import java.util.Scanner;

public class ExConceitosBasicos4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Informe um valor para obter o seu valaor ao quadrado e valor ao cubo.");
		
		double valor = entrada.nextDouble();
		
		double vQuadrado = Math.pow(valor, 2);
		double vCubo = Math.pow(valor, 3);
		
		System.out.println(" O valor digitado foi: " + valor + "\n e seu valor ao quadrado é: " + vQuadrado + "\n e seu valor ao cubo é: " + vCubo);
		
		entrada.close();
	}

}
