package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConverssao {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));

		Scanner entradaTeclado = new Scanner(System.in);

		String salario1, salario2, salario3;

		System.out.println("\n Informe os 3 ultimos salarios do funcionario.\n\n");
		System.out.println(" **** Para obte a media entre os 3 salarios**** \n\n");

		System.out.println("\n Informe o primeiro salario.\n");
		salario1 = entradaTeclado.nextLine().replace("," , ".");

		System.out.println("\n Informe o segundo salario.\n");
		salario2 = entradaTeclado.nextLine().replace("," , ".");

		System.out.println("\n Informe o terceiro salario.\n");
		salario3 = entradaTeclado.nextLine().replace("," , ".");

		Double sal1conv = Double.parseDouble(salario1);
		Double sal2conv = Double.parseDouble(salario2);
		Double sal3conv = Double.parseDouble(salario3);

		System.out.println("\n  Os salarios digitados foram: \n\n" + " salario 1 R$: " + sal1conv + "\n salario 2 R$: "
				+ sal2conv + "\n salario 3 R$: " + sal3conv);

		Double media = (sal1conv + sal2conv + sal3conv) / 3;

		entradaTeclado.close();
		
		System.out.println("\n A Media dos 3 salarios digitados é : \n R$" + media);

	}

}
