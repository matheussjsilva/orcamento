package com.example.orcamento.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "custo_fixo_item")
public class CustoFixoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custo_fixo_item_id_gen")
    @SequenceGenerator(name = "custo_fixo_item_id_gen", sequenceName = "custo_fixo_id_s", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    private String descricao;
    private double valor;
    private Long custoFixoId;

    @ManyToOne
    @JoinColumn(name = "id_custo")
    private CustoFixo custoFixo;

    public CustoFixoItem() {
    }

    public CustoFixoItem(String descricao, double valor, Long custoFixoId) {
        this.descricao = descricao;
        this.valor = valor;
        this.custoFixoId = custoFixoId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Long getCustoFixoId() {
        return custoFixoId;
    }

    public void setCustoFixoId(Long custoFixoId) {
        this.custoFixoId = custoFixoId;
    }

}
