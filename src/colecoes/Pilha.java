package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>(); // criar uma pilha

		livros.add("O pequeno pr�ncepe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
				
		System.out.println(livros.peek()); // Somente l� o ultimo elemento da pilha
		
		System.out.println(livros.peek()); // caso a pilha esteja vazia retorna null n�o retorna erro caso a pilha
											// esteja vazia
		// utilizando o foreach para ler �  percorrer todos os lelementos da lista 
		for(String livro: livros) {
			System.out.println(livro); 
		}
					
		System.out.println(livros.element()); // caso a pilha esteja vazia retorna um erro de exes��o dizendo que n�o
												// existe esse elemento na lista

		System.out.println(livros.remove()); // Quando a pilha est� vazia retorna um erro de exes��o
	
		System.out.println(livros.poll()); // l� � remove o primeiro elemento da pilha quando n�o tem mais elementos na
											// pilha retorna null cada vez que e verificada a pilha e est� zerada
		System.out.println(livros.poll());
		System.out.println(livros.poll());

//		System.out.println(livros.pop()); // mesmo que o remove Quando a pilha est� vazia retorna um erro de exes��o

		System.out.println(livros.size()); // verificar o tamanho da pilha

//		livros.clear(); // limpar a pilha
//		livros.isEmpty(); // verificar se a pilha esta vazia
//		livros.contains(livros);
//		O primeiro a entrar e o ultimo a sair
		
		
	}

}
