package com.example.orcamento.model.dto;

import java.time.LocalDate;

public class CustoFixoRequestDTO {

    private Long idCusto;
    private LocalDate mesReferencia;

    public CustoFixoRequestDTO() {
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

    public void setMesReferencia(LocalDate mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

}
