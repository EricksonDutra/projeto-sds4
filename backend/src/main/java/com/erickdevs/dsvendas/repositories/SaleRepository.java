package com.erickdevs.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickdevs.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
