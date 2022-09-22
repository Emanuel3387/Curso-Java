package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
	
	public static void main(String[] args) {

		java.util.Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// OBS: put tanto adiciona quanto altera 
		usuarios.put(1, "Roberto"); // adicioando
		usuarios.put(20, "Ricardo"); // adicioando
		usuarios.put(3, "Rafaela"); // adicioando
		usuarios.put(4, "Rafael"); // adicioando
		usuarios.put(4, "Rebeca"); // alterando mesma chave e valor diferente
		
		System.out.println(usuarios.size()); // verifica o tamanho do map
		
		System.out.println(usuarios.isEmpty()); // verificando se o map esta vazio
		
		System.out.println(usuarios.keySet()); // retorna as chaves do map
		
		System.out.println(usuarios.values()); // retorna os valores do map
		
		System.out.println(usuarios.entrySet()); // retorna as chaves e os valores do map
		
		System.out.println(usuarios.containsKey(20)); // verifica se contem a chave, resultado boobleano
		
		System.out.println(usuarios.containsValue("Rebeca")); // verifica se tem o valor, resultado booleano
		
		System.out.println(usuarios.get(4)); // retorna o valor referenciado pela chave
		
		System.out.println(usuarios.remove(1)); // removendo atraves da chave
		
		System.out.println(usuarios.remove(3, "Rafaela")); // removendo atraves da chave e valor
		
		
		// Utilizando o foreach para percorrer as chaves do map, nesse caso as chaves tem seu valor com int
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		// Utilizando o foreach para percorrer os valores do map, neste caso os valores são do tipo String
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
				
		// Utilizando o Entry para percorer as chaves e os valores do map ao mesmo tempo
		
		for(Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.println(registro.getKey() + "==>");
			System.out.println(registro.getValue());
			
		}		
	}
}
