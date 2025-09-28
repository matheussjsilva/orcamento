package com.example.orcamento.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "orcamento")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "oracamento_id_gen")
    @SequenceGenerator(name = "oracamento_id_gen", sequenceName = "orcamento_id_s", allocationSize = 1)
    @Column(name = "id_orcamento")
    private Long idOrcamento;

    private LocalDate data;

    private double valorTotal;

    private Long idCliente;

    private Long custoFixoId;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "custo_fixo_id")
    private CustoFixo custoFixo;

    @OneToMany(mappedBy = "orcamento")
    private List<ItemOrcamento> itens;

    public Orcamento() {
        this.data = LocalDate.now();
    }

    public Orcamento(Long idOrcamento, LocalDate data, double valorTotal, Long idCliente, Long custoFixoId) {
        this.idOrcamento = idOrcamento;
        this.data = data;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
        this.custoFixoId = custoFixoId;

    }

    public Long getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(Long idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getCustoFixoId() {
        return custoFixoId;
    }

    public void setCustoFixoId(Long custoFixoId) {
        this.custoFixoId = custoFixoId;
    }

}
