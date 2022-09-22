package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>(); // construindo uma lista
		
		// Offer e Add -> adiciona elementos na fila
		// Diferença é o comportamento quanto a ffila está cheia!
		
		fila.add("Ana"); // utilizado para listas retorna uma exceção quando a fila esta cheia
		fila.offer("Bia"); // utilizado para listas com limite de tamanho retornando true ou false apos a tentativa de adição a lista
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); // Somente lé o primeiro elemento da fila
		System.out.println(fila.peek()); // caso a lista esteja vazia retorna null não retorna erro caso a lista esteja vazia
		System.out.println(fila.element()); // caso alista esteja vazia retorna um erro de exesção dizendo que não existe esse elemento na lista
		
		System.out.println(fila.size()); // verificar o tamanho da fila
//		fila.clear(); // limpar a fila
//		fila.isEmpty(); // verificar se a fila esta vazia
		
		System.out.println(fila.remove()); // Quando a lista está vazia retorna um erro de exesção
		System.out.println(fila.poll()); // lé é remove o primeiro elemento da fila quando não tem mais elementos na fila retorna null cada vez que e verificada a fila e está zerada
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}

}
// fila o primeiro a entrar e o primeiro a sair