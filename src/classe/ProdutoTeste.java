package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		//* Utilizando o contrutor padrao classe produto
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		Produto.desconto = 0.35;
		
		//* Utilizando o contrutor classe produto com 2 parametros

		var p2 = new Produto("Caneta Preta", .28);
		
		//* Utilizando o contrutor classe produto com 3 parametros
			
		Produto p3 = new Produto("Monitor", 450.85, 0.30);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double precoFinal3 = p3.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;

		System.out.println("Produto 1: " + p1.nome + " " + p1.precoComDesconto());
		System.out.println("Produto 2: " + p2.nome + " " + p2.precoComDesconto());
		System.out.printf("Produto 3: " + p3.nome + " Valor: " + p3.preco + " Desconto de: " + Produto.desconto +" Valor final com desconto: "+ p3.precoComDesconto());


		System.out.printf("\nMedia do carrinho = R$%.2f.", mediaCarrinho);
				
	}

}
