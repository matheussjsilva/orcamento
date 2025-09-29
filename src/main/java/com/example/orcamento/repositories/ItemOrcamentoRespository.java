package com.example.orcamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orcamento.model.entity.ItemOrcamento;

@Repository
public interface ItemOrcamentoRespository extends JpaRepository<ItemOrcamento, Long> {

}
