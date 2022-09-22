package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// HashSet<String> listaAprovados = new HashSet<String>(); // <String> Obriga o
		// conteudo da lista a ser do tipo String Valores de tipos diferentes são
		// convertidos automaticamento processo conhecido como auto box.
		SortedSet<String> listaAprovados = new TreeSet<String>(); // TreeSet Ordena a lista de acordo com a entrada de
																	// dados, e é possível se ordenar a lista.
		listaAprovados.add("Arroz");
		listaAprovados.add("Batata");
		listaAprovados.add("Feijão");
		listaAprovados.add("Manteiga");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		HashSet<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		for (int n : nums) {
			System.out.println(n);
		}

	}
}

// <String> OBS: Tipo de notação generics.
