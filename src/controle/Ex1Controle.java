package controle;

import java.util.Scanner;

public class Ex1Controle {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		
		System.out.println("Digite um n�mero entre 0 e 10.");
		int numero = entrada.nextInt();
		
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " est� entre 0 e 10 e � um par.");
			} else {
				System.out.println("O numero " + numero + " est� entre 0 e 10 mas n�o � um par.");
			}
		} else {
			System.out.println("O numero " + numero + " n�o est� entre 0 e 10.");
		}
		entrada.close();

	}

}
