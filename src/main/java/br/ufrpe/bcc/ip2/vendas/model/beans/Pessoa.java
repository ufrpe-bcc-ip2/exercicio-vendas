package br.ufrpe.bcc.ip2.vendas.model.beans;

import br.ufrpe.bcc.ip2.vendas.Util;

import java.util.Date;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private String endereço;
    private Date dataAniversario;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereço='" + endereço + '\'' +
                ", dataAniversario=" + dataAniversario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        if (!nome.equals(pessoa.nome)) return false;
        if (!email.equals(pessoa.email)) return false;
        if (telefone != null ? !telefone.equals(pessoa.telefone) : pessoa.telefone != null) return false;
        if (endereço != null ? !endereço.equals(pessoa.endereço) : pessoa.endereço != null) return false;
        return dataAniversario.equals(pessoa.dataAniversario);
    }

    @Override
    public int hashCode() {
        int result = getNome().hashCode();
        result = 31 * result + getEmail().hashCode();
        result = 31 * result + getTelefone().hashCode();
        result = 31 * result + getEndereço().hashCode();
        result = 31 * result + getDataAniversario().hashCode();
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = Util.parseDate(dataAniversario);
    }

}
