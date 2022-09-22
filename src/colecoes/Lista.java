package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Manu")); // O modelo heterogenio de lista permite dados duplicados
		
		System.out.println(lista.get(0).nome); // sainda de dados por inddice
		System.out.println(lista.get(1).nome); // sainda de dados por inddice
		System.out.println(lista.get(2).nome); // sainda de dados por inddice
		System.out.println(lista.get(3).nome); // sainda de dados por inddice
		
		System.out.println(lista.get(3)); // acessar pelo indice
		
		System.out.println(">>>> " + lista.remove(1)); // remoção por indice resultado valor contido no local indicado da mémora volatíl pelo indice.
		
		System.out.println(lista.remove(new Usuario("Manu"))); // remoção por objeto resultado booleano true ou false mesmo removendo manu ainda ficou uma pois esse modelo de lista permite valores duplicados
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia"))); // pesquisa se contem na lista
		
		// percorrendo uma lista utilizando foreach
		for(Usuario u: lista) { 
			System.out.println(u.nome);
			System.out.println(u.toString());
		}

	}

}
