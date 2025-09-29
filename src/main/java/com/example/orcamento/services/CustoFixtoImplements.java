package com.example.orcamento.services;

import org.springframework.stereotype.Service;

import com.example.orcamento.model.dto.CustoFixoRequestDTO;
import com.example.orcamento.model.entity.CustoFixo;
import com.example.orcamento.repositories.CustoFixoRepository;

@Service
public class CustoFixtoImplements implements CustoFixoService {

    private CustoFixoRepository custoFixoRepository;

    @Override
    public CustoFixo salvarCustoFixo(CustoFixoRequestDTO request) {

        return null;
    }

}
