package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado { // Conjunto de dados Heterogênio

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double nesse caso e convertido o valor double para Double (Objeto).
		conjunto.add(true); // double -> bolean nesse caso e convertido o valor boolean para Bolean
							// (Objeto).
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Interger nesse caso e convertido o valor int para Interger ( Objeto).
		conjunto.add('x'); // char -> Character nesse caso e convertido o valor char para Character
							// (Objeto).

		System.out.println("Tamanhao é: " + conjunto.size());

		conjunto.add("Teste"); // OBS Conjunto não aceita dados duplicados ou com o mesmo tipo e valor.
		conjunto.add("teste"); // O conjunto faz diferença de letras maisculas e minusculas sendo então valores
								// diferentes.

		System.out.println("Tamanhao é: " + conjunto.size());

		System.out.println(conjunto.remove("Boi")); // OBS não é removido pois não faz parte do conjunto.
		System.out.println(conjunto.remove("Teste")); // Quando removido com sucesso retorna um boolean true para
														// removido com sucesso e false para não removido.
		System.out.println(conjunto.remove('x')); // Quando removido com sucesso retorna um boolean true para removido
													// com sucesso e false para não removido.

		System.out.println("Tamanhao é: " + conjunto.size());

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));

		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);

		// conjunto.addAll(nums); // união dos dados entre conjuntos.

	}
}
