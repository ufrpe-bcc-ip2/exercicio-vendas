package br.ufrpe.bcc.ip2.vendas.model.business;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;
import br.ufrpe.bcc.ip2.vendas.model.persistence.ClienteDAO;

import java.util.List;

public class ClienteBusiness {
    private static ClienteBusiness instance = new ClienteBusiness();

    public static ClienteBusiness getInstance() {
        return instance;
    }

    private ClienteBusiness() {
//        Codigo para teste
//        Cliente cliente01 = new Cliente();
//        cliente01.setNome("jose");
//        cliente01.setEmail("jose@email.com");
//        cliente01.setCpf("000.111.222.333-33");
//        cliente01.setDataAniversario("1980-12-20");
//        cliente01.setEndereço("Rua Sem nome, 320");
//        cliente01.setLimiteCredito(1000.00);
//        cliente01.setTelefone("(81) 3333-2244");
//        ClienteDAO.getInstance().salvar(cliente01);
    }

    public void salvar(Cliente cliente) {
        // verificar se o cliente ja existe, etc
        // ...

        // outras verificacoes


        // adicionar o cliente
        ClienteDAO.getInstance().salvar(cliente);
    }

    public List listarTodos() {
        return ClienteDAO.getInstance().listarTodos();
    }
}
