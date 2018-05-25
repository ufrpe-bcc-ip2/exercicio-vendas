package br.ufrpe.bcc.ip2.vendas.controller;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;
import br.ufrpe.bcc.ip2.vendas.model.business.ClienteBusiness;
import br.ufrpe.bcc.ip2.vendas.view.ShellGUI;

import java.util.Map;

public class FrontController {

    private final ShellGUI view;

    public FrontController(ShellGUI view) {
        this.view = view;
    }

    public void run() {
        String cmd;
        this.view.exibirMenu();

        while ((cmd = view.lerComando("DIGITE UMA OPÇÃO > ")) != null) {

            if ("1".equals(cmd)) {
                // cadastrar cliente
                Map<String, String> dados = this.view.cadastrarCliente();

                Cliente cliente = new Cliente();
                cliente.setNome(dados.get("nome"));
                cliente.setEmail(dados.get("email"));
                cliente.setLimiteCredito(Double.parseDouble(dados.get("limiteCredito")));
                ClienteBusiness.getInstance().salvar(cliente);

            } else if ("2".equals(cmd)) {

                // listar clientes
                this.view.listarClientes(ClienteBusiness.getInstance().listarTodos());

            } else if ("x".equals(cmd)) {

                System.exit(0);
            }

            this.view.exibirMenu();

        }

    }

}
