package br.ufrpe.bcc.ip2.vendas.model;

import java.util.Date;
import java.util.Objects;

public class Venda {
    private Date dataVenda;
    private Produto produto;
    private int quantidade;
    private Cliente cliente;
    private Vendedor vendedor;

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", produto=" + produto +
                ", quantidade=" + quantidade +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Venda venda = (Venda) o;

        if (getQuantidade() != venda.getQuantidade()) return false;
        if (!getDataVenda().equals(venda.getDataVenda())) return false;
        if (!getProduto().equals(venda.getProduto())) return false;
        if (!getCliente().equals(venda.getCliente())) return false;
        return getVendedor().equals(venda.getVendedor());
    }

    @Override
    public int hashCode() {
        int result = getDataVenda().hashCode();
        result = 31 * result + getProduto().hashCode();
        result = 31 * result + getQuantidade();
        result = 31 * result + getCliente().hashCode();
        result = 31 * result + getVendedor().hashCode();
        return result;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() { return vendedor; }

    public void setVendedor(Vendedor vendedor) { this.vendedor = vendedor;  }
}
