package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas voc� quqer obter a m�dia? ");
		int qtdNotas = entrada.nextInt();
		
		double notas[] = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota: " + (i + 1) + ".");
			notas[i] = entrada.nextDouble();
		}
		
		double somaNotas = 0;
		for(double nota: notas) {
			somaNotas += nota;
		}
		
		double media = somaNotas / notas.length;
		System.out.println("A m�dia �: " + media + ".");

		entrada.close();
	}
}