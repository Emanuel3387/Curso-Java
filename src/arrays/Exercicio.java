package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 9.0;
		notasAlunoA[2] = 6.5;
		notasAlunoA[2] = 8.2;
		
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[1]);
		System.out.println(notasAlunoA[2]);
		System.out.println(notasAlunoA[3]);
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for ( int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		double totalAlunoB = 0.0;
	for (int i = 0; i < notasAlunoB.length; i++) {
		totalAlunoB += notasAlunoB[i];
	}
	System.out.println(totalAlunoB / notasAlunoB.length);

	}

}
