package model;

public class Produto {

	private int id;
	private String descricao;
	private double precoVenda;
	private double quantidadeEmEstoque;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	public double getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	public void setQuantidadeEmEstoque(double quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}	
	
	@Override
	public String toString() {
		return "Produto: "+getDescricao()+"\nPreço de Venda: "+getPrecoVenda()+"\nQuantidade em Estoque: "+getQuantidadeEmEstoque();
	}
}
