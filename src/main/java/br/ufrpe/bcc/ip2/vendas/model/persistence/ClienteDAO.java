package br.ufrpe.bcc.ip2.vendas.model.persistence;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    private List<Cliente> repositorio;
    private static ClienteDAO instance = new ClienteDAO();

    private ClienteDAO() {
        this.repositorio = new ArrayList<Cliente>();
    }

    public static ClienteDAO getInstance() {
        return instance;
    }

    public void salvar(Cliente cliente) {
        // adicionar o cliente
        this.repositorio.add(cliente);
    }

    public List listarTodos() {
        return this.repositorio;
    }
}
