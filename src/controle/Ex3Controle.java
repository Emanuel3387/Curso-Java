package controle;

import java.util.Scanner;

public class Ex3Controle {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" Digite a primeira nota.");
		double nota1 = entrada.nextDouble();
		
		System.out.println(" Digite a primeira nota.");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >=7) {
			System.out.println("A media foi: " + media + " APROVADO" );
		}else if(media > 7 && media  > 4) {
			System.out.println("A media foi: \" + media + \" RECUPERAÇÃO");
		}else {
			System.out.println("A media foi: \" + media + \" REPROVADO");
		}
		System.out.println(" FIM DO PROGRAMA!");
		entrada.close();

	}

}
