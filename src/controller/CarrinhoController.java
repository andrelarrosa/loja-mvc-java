package controller;

import java.util.ArrayList;
import java.util.List;

import model.Carrinho;
import model.Cliente;

public class CarrinhoController {

	public static List<Carrinho> carrinhos = new ArrayList<Carrinho>();
	
	public int gerarId() {
		return carrinhos.size()-1;
	}
	
	public void adicionarCarrinho(Cliente cliente) {
		Carrinho carrinho = new Carrinho();
		try {
			carrinho.setId(gerarId());
			carrinho.setCliente(cliente);
			carrinhos.add(carrinho);
			System.out.println("Carrinho iniciado!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void removerCarrinho(int id) {
		try {
			carrinhos.remove(id-1);
			System.out.println("Carrinho removido e encerrado!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
