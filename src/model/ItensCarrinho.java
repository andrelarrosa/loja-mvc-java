package model;

import model.Carrinho;
import model.Produto;

public class ItensCarrinho {

	private int id;
	private Carrinho carrinho;
	private Produto produto;
	private double quantidade;
	private double valorUnitario;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}	
	
	@Override
	public String toString() {
		return "Cliente: "+carrinho.getCliente()+"\nProduto: "+produto.getDescricao()+"\nPreço: "+produto.getPrecoVenda();
	}
}
