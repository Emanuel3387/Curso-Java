package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}

	double obterValortotal() {
		double totalItens = 0;

		for (Item item: itens) {
			 totalItens += item.quantidade;
			
		}
		return totalItens;
	}
}
