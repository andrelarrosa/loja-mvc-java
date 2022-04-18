package controller;

import java.util.ArrayList;
import java.util.List;

import model.ItensCarrinho;
import model.Produto;
import model.Carrinho;

public class ItensCarrinhoController {

	public static List<ItensCarrinho> itensCarrinho = new ArrayList<ItensCarrinho>();
	public void adicionarItem(Produto produto, Carrinho carrinho, double valorUnitario, double quantidade) {
		if(quantidade<=0) {
			System.out.println("Impossível fazer a compra com nenhum produto em estoque");
			System.exit(0);
		}
		ItensCarrinho item = new ItensCarrinho();
		item.setProduto(produto);
		item.setValorUnitario(valorUnitario);
		item.setCarrinho(carrinho);
		item.setQuantidade(quantidade);
		itensCarrinho.add(item);
	}
	
	public void removerItem(Produto produto, Carrinho carrinho, double valorUnitario, double quantidade) {
		ItensCarrinho item = new ItensCarrinho();
		item.setProduto(produto);
		item.setValorUnitario(valorUnitario);
		item.setCarrinho(carrinho);
		item.setQuantidade(quantidade);
		itensCarrinho.remove(item);
	}
	
	public double calcularValorTotalVenda(double desconto) {
		double soma = 0;
		for(int i = 0; i < itensCarrinho.size(); i++) {
			soma = soma+itensCarrinho.get(i).getValorUnitario();
		}
		return soma-desconto;
	}
	
	public double calcularValorTotalProdutosVenda(double desconto) {
		double soma = 0;
		for(int i = 0; i < itensCarrinho.size(); i++) {
			soma = soma+itensCarrinho.get(i).getValorUnitario();
		}
		return soma;
	}
	
	public double calcularValorTotalProdutos() {
		double soma = 0;
		for(int i = 0; i < itensCarrinho.size(); i++) {
			soma = soma+(itensCarrinho.get(i).getValorUnitario()*itensCarrinho.get(i).getQuantidade());
		}
		return soma;
	}
	
	
	public void emitirRelatorio(Carrinho carrinho) {
		System.out.println("======= RELATÓRIO =======");
		System.out.println("Cliente: "+carrinho.getCliente()+"\nProdutos: ");
		for(int i = 0; i < itensCarrinho.size(); i++) {
			System.out.println(itensCarrinho.get(i).getProduto().getDescricao()+" - "+itensCarrinho.get(i).getQuantidade()+" X "+itensCarrinho.get(i).getValorUnitario());
		}
		System.out.println("Valor total dos itens: " + calcularValorTotalProdutos());
		System.out.println("Valor total dos itens na venda: " + calcularValorTotalProdutosVenda(5));
		System.out.println("Valor total da venda: " + calcularValorTotalVenda(5));
		System.out.println("=========================");
	}
	
	public void listarItensCarrinho() {
		String produtos = "";
		String nomeCliente = "";
		for(int i = 0; i < itensCarrinho.size(); i++) {
			for(int j = 0; j < itensCarrinho.size(); j++) {
				produtos = itensCarrinho.get(j).getProduto().getDescricao()+" - "+itensCarrinho.get(j).getQuantidade()+" X "+itensCarrinho.get(j).getValorUnitario()+"\n";
			}
			nomeCliente = itensCarrinho.get(i).getCarrinho().getCliente().getNome();
			System.out.println("Cliente: "+nomeCliente+"\nProdutos: "+produtos+"\n");
		}
	}
}
