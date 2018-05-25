package br.ufrpe.bcc.ip2.vendas;

import br.ufrpe.bcc.ip2.vendas.controller.FrontController;
import br.ufrpe.bcc.ip2.vendas.view.ShellGUI;

public class VendasApp {
    public static void main(String[] args) {

        ShellGUI frontEnd = new ShellGUI();
        FrontController frontController = new FrontController(frontEnd);

        frontController.run();
    }
}
