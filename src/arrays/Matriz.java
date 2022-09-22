package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Infome a quantidade de alunos, Para obter a média de notas!");
		int qtdAlunos = entrada.nextInt();

		System.out.println("Informe quantas notas cada aluno vai ter!");
		int qtdNotas = entrada.nextInt();

		double notasAlunos[][] = new double[qtdAlunos][qtdNotas];

		double somoaNotasAlunos = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos.length; j++) {
				System.out.printf("Informe a nota: %d  do aluno: %d: ", i + 1, j + 1);
				notasAlunos[i][j] = entrada.nextDouble();
				somoaNotasAlunos += notasAlunos[i][j];
			}
		}

		double media = somoaNotasAlunos / (qtdAlunos * qtdNotas);
		System.out.println("A média dos alunos é: " + media);

		for (double[] notasDosAlunos : notasAlunos) {
			System.out.println(Arrays.toString(notasDosAlunos));
		}

		entrada.close();

	}

}
