package controle;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.println("Informe nota");
		int nota = entrada.nextInt();
		
				switch (nota) {
				case 9: case 10:
					conceito = "A";
					break;
				case 7: case 8:
					conceito = "B";	
					break;
				case 5: case 6:
					conceito = "C";	
					break;
				case 3: case 4:
					conceito = "D";	
					break;
				case 0: case 1: case 2:
					conceito = "E";	
					break;
				default:
					conceito = "Não encontrado!";						
				}
								
				System.out.println("Conceito é: " + conceito);
				entrada.close();

	}

}
