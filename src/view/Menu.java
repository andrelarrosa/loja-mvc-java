package view;

import java.util.Scanner;

import controller.CarrinhoController;
import controller.ClienteController;
import controller.ItensCarrinhoController;
import controller.ProdutoController;

public class Menu {
	
	public void criarMenu() {
		boolean repeat = true;
		while(repeat) {
			System.out.println("O que deseja fazer?\n1-Cadastrar Cliente\n2-Listar Clientes\n3-Cadastrar Produto\n4-Listar Produtos\n5-Inserir Itens no Carrinho\n6-Listar Itens do Carrinho");
			Scanner scan = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			int escolha = scan.nextInt();
			switch (escolha) {
			case 1:
				ClienteController clienteController = new ClienteController();
				System.out.println("Informe o CPF do cliente");
				String cpf = scan.next();
				System.out.println("Informe o nome do cliente");
				String nome = scan.next();
				clienteController.adicionarCliente(cpf, nome);				
				break;
			case 2:
				ClienteController clienteController2 = new ClienteController();
				clienteController2.listarClientes();
				break;
			case 3:
				ProdutoController produtoController = new ProdutoController();
				System.out.println("Informe a descrição do produto:");
				String descricao = scan.next();
				System.out.println("Informe o preço de venda do produto:");
				double precoVenda = scan.nextDouble();
				System.out.println("Informe a quantidade do produto:");
				double quantidadeEmEstoque = scan.nextDouble();
				produtoController.adicinarProduto(descricao, precoVenda, quantidadeEmEstoque);
				break;
			case 4:
				ProdutoController produtoController2 = new ProdutoController();
				produtoController2.listarProdutos();
				break;
			case 5:
				CarrinhoController carrinhoController = new CarrinhoController();
				System.out.println("Informe o código do cliente:");
				int codigoCliente = scan.nextInt();
				carrinhoController.adicionarCarrinho(ClienteController.clientes.get(codigoCliente-1));
				System.out.println("Informe o código do item que você deseja adicionar:");
				int codigoItem = scan.nextInt();
				System.out.println("Informe o código do carrinho que você deseja adicionar o produto:");
				int codigoCarrinho = scan.nextInt();
				System.out.println("Informe a quantidade deste produto:");
				double quantidadeProduto = scan.nextDouble();
				ItensCarrinhoController itensCarrinho = new ItensCarrinhoController();
				itensCarrinho.adicionarItem(ProdutoController.produtos.get(codigoItem-1), CarrinhoController.carrinhos.get(codigoCarrinho-1), ProdutoController.produtos.get(codigoItem-1).getPrecoVenda(), quantidadeProduto);
				break;
			case 6:
				ItensCarrinhoController itensCarrinho2 = new ItensCarrinhoController();
				itensCarrinho2.listarItensCarrinho();
				break;
			}
			System.out.println("Gostaria de fazer mais alguma operação?\n1- Sim\n2- Não");
			int maisOperacoes = scan2.nextInt();
			if(maisOperacoes == 1) {
				repeat = true;
			}else {
				repeat = false;
				System.out.println("Sistema encerrado!");
			}
		}
	}
}
