package controle;

import java.util.Scanner;

public class Ex2Controle {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Digite o ano que deseja, para saber se ele � um ano bisexto ou n�o.");
		
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ano de: " + ano + " � bisexto.");
		}else if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano de: " + ano + " � bisexto.");
		}else {
			System.out.println(" O ano de: " + ano + " n�o � bisexto.");
		}
		entrada.close();
	}
}