package classe;

public class Produto {

	String nome; //* Váriavel nome Atributo Objeto Produto
	double preco; //* Váriavel preco Atributo Objeto Produto
	static double desconto = 0.25; // Váriavel desconto Atributo Objeto Produto / static faz com que o valor da variavel desconto seja armazenado unicamente na variavel desconto da classe Produto quando alterado altera em todos os objetos que a utilizam

	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	//*Construtor padrão sem parametros Objeto Produto EX:
	
	Produto(){
		
	}
	
	// *Construtor com 1 parametro Objeto Produto

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	// *Construtor com 2 parametros Objeto Produto

	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}

	// *Construtor com 3 parametros Objeto Produto

	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}

}
//* Caso seja criado algum contrutor que seja pasado parametros o contrutor padrão e perdido, podendo ser refeito como exemplo