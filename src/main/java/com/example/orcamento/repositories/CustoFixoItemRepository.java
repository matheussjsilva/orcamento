package com.example.orcamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orcamento.model.entity.CustoFixoItem;

@Repository
public interface CustoFixoItemRepository extends JpaRepository<CustoFixoItem, Long> {

}
