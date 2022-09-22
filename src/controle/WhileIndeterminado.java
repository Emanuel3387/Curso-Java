package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String nome = "";
				
		while(!nome.equalsIgnoreCase("sair")) {
			System.out.println(" Digite seu nome ou Sair para finalizar o programa. ");
			nome = entrada.nextLine();
			System.out.println("\n\n Olá " + nome + "." + " E um prazer em te receber.\n\n");
		}
				
		entrada.close();
		
	}
}