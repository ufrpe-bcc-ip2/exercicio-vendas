package br.ufrpe.bcc.ip2.vendas.model;

import br.ufrpe.bcc.ip2.vendas.Util;

import java.util.Date;

public class Vendedor extends PessoaFisica {
    private String matricula;
    private Date dataContratacao;

    @Override
    public String toString() {
        return "Vendedor{" +
                super.toString() + ", " +
                "matricula='" + matricula + '\'' +
                ", dataContratacao=" + dataContratacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Vendedor vendedor = (Vendedor) o;

        if (!getMatricula().equals(vendedor.getMatricula())) return false;
        return getDataContratacao().equals(vendedor.getDataContratacao());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMatricula().hashCode();
        result = 31 * result + getDataContratacao().hashCode();
        return result;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setDataContratacao(String dataAniversario) {
        this.dataContratacao = Util.parseDate(dataAniversario);
    }
}
