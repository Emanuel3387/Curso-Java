package fundamentos.operadores;

import java.util.Scanner;

public class tipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new  Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); // .trim para retirar os espassos em branco digitados na entrada de dados do telclado
		System.out.println("2" .equals(s2.trim())); 
		
		entrada.close();   // para comparação de strings deve se utilizar equals e não ==

	}

}
