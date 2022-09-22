package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println(" informe dois valores e depois escolha aoperação aser realizada \n");

		System.out.println(" Digite o primeiro valor.");
		double num1 = entrada.nextDouble();

		System.out.println("\n Digite o segundo valor.\n");
		double num2 = entrada.nextDouble();

		System.out.println("Informe a operação que deseja relaizar \n (+) (-) (*) (/) ou (%) resto da divisão \n");

		String op = entrada.next();

		// Lógica

		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;

		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		entrada.close();

	}

}
