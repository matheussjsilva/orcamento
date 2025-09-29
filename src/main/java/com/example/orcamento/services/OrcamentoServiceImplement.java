package com.example.orcamento.services;

import org.springframework.stereotype.Service;

import com.example.orcamento.model.dto.CalculaOrcamentoRequestDTO;
import com.example.orcamento.model.entity.Orcamento;

@Service
public class OrcamentoServiceImplement implements OrcamentoService {

    @Override
    public Orcamento calcularOrcamento(CalculaOrcamentoRequestDTO request) {
        return null;
    }

    @Override
    public String testeApi(String request) {
        return "Teste okay " + request;
    }

}
