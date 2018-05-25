package br.ufrpe.bcc.ip2.vendas;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;
import br.ufrpe.bcc.ip2.vendas.model.beans.Produto;
import br.ufrpe.bcc.ip2.vendas.model.beans.Vendedor;

public class App {
    public static void main(String[] args) {

        // Produto
        Produto pSal = new Produto();
        pSal.setNome("Sal");
        pSal.setEstoqueAtual(10);
        pSal.setEstoqueMinimo(5);
        pSal.setPeso(1.0);
        pSal.setPreco(2.5);

        // Cliente
        Cliente cliente01 = new Cliente();
        cliente01.setNome("jose");
        cliente01.setEmail("jose@email.com");
        cliente01.setCpf("000.111.222.333-33");
        cliente01.setDataAniversario("1980-12-20");
        cliente01.setEndereço("Rua Sem nome, 320");
        cliente01.setLimiteCredito(1000.00);
        cliente01.setTelefone("(81) 3333-2244");

        // Vendedor
        Vendedor vendedor01 = new Vendedor();
        vendedor01.setNome("maria");
        vendedor01.setEmail("maria@email.com");
        vendedor01.setCpf("000.222.111.333-33");
        vendedor01.setDataAniversario("1983-12-20");
        vendedor01.setEndereço("Rua Dom Manoel de Medeiros, S/N");
        vendedor01.setTelefone("(81) 3217-2244");
        vendedor01.setDataContratacao("2011-12-30");
        vendedor01.setMatricula("011222333");

        System.out.println(cliente01);

    }
}
