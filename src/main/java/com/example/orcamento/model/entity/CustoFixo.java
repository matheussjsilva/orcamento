package com.example.orcamento.model.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "custo_fixo")
public class CustoFixo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custo_fixo_gen")
    @SequenceGenerator(name = "custo_fixo_gen", sequenceName = "custo_fixo_id_s", allocationSize = 1)
    @Column(name = "id_custo")
    private Long idCusto;

    @Column(name = "mes_referencia")
    private LocalDate mesReferencia;

    public void setMesReferencia(LocalDate mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    @OneToMany(mappedBy = "custoFixo")
    List<CustoFixoItem> custoFixoItem;

    @OneToMany(mappedBy = "custoFixo")
    List<Orcamento> orcamento;

    public CustoFixo() {
        this.mesReferencia = LocalDate.now();
    }

    public CustoFixo(Long idCusto, LocalDate mesReferencia) {
        this.idCusto = idCusto;
        this.mesReferencia = LocalDate.now();
    }

    public Long getIdCusto() {
        return idCusto;
    }

    public void setIdCusto(Long idCusto) {
        this.idCusto = idCusto;
    }

    public LocalDate getMesReferencia() {
        return mesReferencia;
    }

}
