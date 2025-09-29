package com.example.orcamento.services;

import com.example.orcamento.model.dto.CustoFixoRequestDTO;
import com.example.orcamento.model.entity.CustoFixo;

public interface CustoFixoService {

    CustoFixo salvarCustoFixo(CustoFixoRequestDTO request);

}
