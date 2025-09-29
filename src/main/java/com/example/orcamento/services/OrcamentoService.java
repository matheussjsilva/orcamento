package com.example.orcamento.services;

import com.example.orcamento.model.dto.CalculaOrcamentoRequestDTO;
import com.example.orcamento.model.entity.Orcamento;

public interface OrcamentoService {

    Orcamento calcularOrcamento(CalculaOrcamentoRequestDTO request);

}
