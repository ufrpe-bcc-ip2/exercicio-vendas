package br.ufrpe.bcc.ip2.vendas.view;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShellGUI {
    Scanner in;

    public ShellGUI() {
        this.in = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----------------------------");
        System.out.println("(1) Cadastrar Cliente");
        System.out.println("(2) Listar Clientes");
        System.out.println("(3) Cadastrar Vendedor");
        System.out.println("(4) Listar Vendedores");
        System.out.println("(5) Cadastrar Produto");
        System.out.println("(6) Listar Produtos");
        System.out.println("(7) Registrar Venda");
        System.out.println("(8) Relatório de Vendas");
        System.out.println("(x) Sair");
        System.out.println("----------------------------");
    }

    public Map<String, String> cadastrarCliente() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Cliente ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Email: ");
        dados.put("email", this.in.nextLine());

        System.out.println("Telefone: ");
        dados.put("telefone", this.in.nextLine());

        System.out.println("Endereço: ");
        dados.put("endereco", this.in.nextLine());

        System.out.println("CPF: ");
        dados.put("cpf", this.in.nextLine());

        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
        dados.put("dataAniversario", this.in.nextLine());

        System.out.println("Limite de crédito: ");
        dados.put("limiteCredito", this.in.nextLine());

        return dados;
    }

    public String lerComando(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public void listarClientes(List<Cliente> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Clientes  ----");
        System.out.println("----------------------------");

        for (Cliente c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereço: \t" + c.getEndereço());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Limite de Credito: \t" + c.getLimiteCredito());
        }
    }
}
