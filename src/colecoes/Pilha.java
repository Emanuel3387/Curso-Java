package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>(); // criar uma pilha

		livros.add("O pequeno príncepe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
				
		System.out.println(livros.peek()); // Somente lé o ultimo elemento da pilha
		
		System.out.println(livros.peek()); // caso a pilha esteja vazia retorna null não retorna erro caso a pilha
											// esteja vazia
		// utilizando o foreach para ler é  percorrer todos os lelementos da lista 
		for(String livro: livros) {
			System.out.println(livro); 
		}
					
		System.out.println(livros.element()); // caso a pilha esteja vazia retorna um erro de exesção dizendo que não
												// existe esse elemento na lista

		System.out.println(livros.remove()); // Quando a pilha está vazia retorna um erro de exesção
	
		System.out.println(livros.poll()); // lé é remove o primeiro elemento da pilha quando não tem mais elementos na
											// pilha retorna null cada vez que e verificada a pilha e está zerada
		System.out.println(livros.poll());
		System.out.println(livros.poll());

//		System.out.println(livros.pop()); // mesmo que o remove Quando a pilha está vazia retorna um erro de exesção

		System.out.println(livros.size()); // verificar o tamanho da pilha

//		livros.clear(); // limpar a pilha
//		livros.isEmpty(); // verificar se a pilha esta vazia
//		livros.contains(livros);
//		O primeiro a entrar e o ultimo a sair
		
		
	}

}
