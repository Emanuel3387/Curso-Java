package controle;

import java.util.Scanner;

public class Ex2Controle {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Digite o ano que deseja, para saber se ele é um ano bisexto ou não.");
		
		int ano = entrada.nextInt();
		
		if(ano % 400 == 0) {
			System.out.println("O ano de: " + ano + " é bisexto.");
		}else if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano de: " + ano + " é bisexto.");
		}else {
			System.out.println(" O ano de: " + ano + " não é bisexto.");
		}
		entrada.close();
	}
}