package com.example.orcamento.model.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

public class Orcamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_gen")
    @SequenceGenerator(name = "usuario_id_gen", sequenceName = "user_id_s", allocationSize = 1)
    private Long idOrcamento;

    private LocalDate data;

    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "custo_fixo_id")
    //private CustoFixo custoFixo;

    @OneToMany(mappedBy = "orcamento")
   // private List<ItemOrcamento> itens;

}
