package com.example.orcamento.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_orcamento")
public class ItemOrcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_orcamento_id_gen")
    @SequenceGenerator(name = "item_orcamento_id_gen", sequenceName = "item_orcamento_id_s", allocationSize = 1)
    @Column(name = "id_item")
    private Long idItem;

    /*
     * @Column(name = "id_orcamento")
     * private Long idOrcamento;
     */
    @Column(name = "id_produto")
    private Long idProduto;

    @Column(name = "quantidade")
    private double quantidade;

    @Column(name = "preco_unitario")
    private double precoUnitario;

    @Column(name = "sub_total")
    private double subTotal;

    @ManyToOne
    @JoinColumn(name = "id_orcamento")
    private Orcamento orcamento;

    public ItemOrcamento() {

    }

    public ItemOrcamento(Long idProduto, double quantidade, double precoUnitario, double subTotal) {

        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subTotal = subTotal;
    }

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

}
