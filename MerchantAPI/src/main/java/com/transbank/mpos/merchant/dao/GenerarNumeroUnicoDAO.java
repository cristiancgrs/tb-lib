package com.transbank.mpos.merchant.dao;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.transbank.mpos.merchant.dto.FT_mposMerchant;

public interface GenerarNumeroUnicoDAO extends CrudRepository<FT_mposMerchant, Long>{
	
	@Procedure(name="ST_GENERA_NUMERO_UNICO")
	String generaNumeroUnico(@Param("CDG_codComercio") Long codComercio);
	
}

