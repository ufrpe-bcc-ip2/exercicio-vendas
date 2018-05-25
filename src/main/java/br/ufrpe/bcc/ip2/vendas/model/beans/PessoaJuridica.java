package br.ufrpe.bcc.ip2.vendas.model.beans;

public class PessoaJuridica extends Pessoa {
    private String cnpj;

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                super.toString() + ", " +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        PessoaJuridica that = (PessoaJuridica) o;

        return getCnpj().equals(that.getCnpj());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getCnpj().hashCode();
        return result;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
