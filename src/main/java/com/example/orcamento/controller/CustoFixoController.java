package com.example.orcamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orcamento.model.dto.CustoFixoRequestDTO;
import com.example.orcamento.model.entity.CustoFixo;
import com.example.orcamento.services.CustoFixoService;

@RestController
@RequestMapping(path = "/api/custoFixo")
public class CustoFixoController {

    private CustoFixoService custoFixoService;

    @PostMapping(path = "/salvar")
    @ResponseBody
    public ResponseEntity<CustoFixo> salvarCusto(@RequestBody CustoFixoRequestDTO request) {

        CustoFixo calculaCustoFixo = custoFixoService.salvarCustoFixo(request);

        return ResponseEntity.ok(calculaCustoFixo);
    }

}
