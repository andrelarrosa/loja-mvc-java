package controller;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class ClienteController {

	public static List<Cliente> clientes = new ArrayList<Cliente>();

	public int gerarId() {
		return clientes.size()+1;
	}
	
	public void adicionarCliente(String cpf, String nome) {
		Cliente cliente = new Cliente();
		try {
			cliente.setId(gerarId());
			cliente.setCpf(cpf);
			cliente.setNome(nome);
			clientes.add(cliente);
			System.out.println("Cliente adicionado com sucesso!");			
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public void removerCliente(int id) {
		try {
			clientes.remove(id-1);			
			System.out.println("Cliente removido com sucesso!");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void listarClientes() {
		String result = "";
		for(int i = 0; i < clientes.size(); i++) {
			result += clientes.get(i).getId()+" - "+clientes.get(i).getCpf()+" - "+clientes.get(i).getNome()+"\n";
		}
		System.out.println(result);
	}
}
