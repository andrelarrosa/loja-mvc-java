package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoController {

	public static List<Produto> produtos = new ArrayList<Produto>();

	public int gerarId() {
		return produtos.size()+1;
	}
	
	public void adicinarProduto(String descricao, double precoVenda, double quantidadeEmEstoque) {
		Produto produto = new Produto();
		try {
			produto.setId(gerarId());
			produto.setDescricao(descricao);
			produto.setPrecoVenda(precoVenda);
			produto.setQuantidadeEmEstoque(quantidadeEmEstoque);
			produtos.add(produto);
			System.out.println("Produto adicionado com sucesso!");			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void removerProduto(int id) {
		try {
			produtos.remove(id-1);
			System.out.println("Produto removido com sucesso!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void listarProdutos() {
		String result = "";
		for(int i = 0; i < produtos.size(); i++) {
			result += produtos.get(i).getId()+" - "+produtos.get(i).getDescricao()+" - "+produtos.get(i).getPrecoVenda()+" - "+produtos.get(i).getQuantidadeEmEstoque()+"\n";
		}
		System.out.println(result);
	}
}
