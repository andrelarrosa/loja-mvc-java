package model;

import java.util.Date;

public class Carrinho {
	
	private int id;
	private Cliente cliente;
	private Date dataCompra = new Date();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	@Override
	public String toString() {
		return "Cliente: "+cliente.getNome()+"\nData da Compra: "+getDataCompra();
	}
	
}
