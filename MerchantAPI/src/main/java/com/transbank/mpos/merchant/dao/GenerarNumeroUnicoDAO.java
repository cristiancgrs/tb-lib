package com.transbank.mpos.merchant.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoRq;

@Repository
public interface GenerarNumeroUnicoDAO extends JpaRepository<GenerarNumeroUnicoRq, Long>{
	
	
}
