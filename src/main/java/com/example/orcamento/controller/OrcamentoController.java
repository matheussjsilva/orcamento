package com.example.orcamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.orcamento.services.OrcamentoService;

@RestController
@RequestMapping(path = "/api/orcamento")
public class OrcamentoController {

    @Autowired
    private OrcamentoService orcamentoService;

    @GetMapping(path = "/teste")
    @ResponseBody
    public String testeApi(@RequestParam String nome) {

        String teste = orcamentoService.testeApi(nome);

        return teste;
    }

}
