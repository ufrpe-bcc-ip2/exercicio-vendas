package br.ufrpe.bcc.ip2.vendas.model.beans;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica() {
    }

    @Override
    public String toString() {
        return "PessoaFisica{\n\t" +
                super.toString() + ", \n" +
                "cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PessoaFisica that = (PessoaFisica) o;

        return getCpf().equals(that.getCpf());
    }

    @Override
    public int hashCode() {
        int result = 31 * getCpf().hashCode();
        return result;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
