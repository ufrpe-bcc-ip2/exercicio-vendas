package br.ufrpe.bcc.ip2.vendas.model.beans;

public class Cliente extends PessoaFisica {

    private double limiteCredito;

    @Override
    public String toString() {
        return "Cliente{\n\t" +
                "SUPER=" + super.toString() + ", \n\t" +
                "limiteCredito=" + limiteCredito +
                '}';
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
