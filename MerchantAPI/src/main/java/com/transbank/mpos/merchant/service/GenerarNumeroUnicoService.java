package com.transbank.mpos.merchant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transbank.mpos.merchant.dao.GenerarNumeroUnicoDAO;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoRequest;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoResponse;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoRq;

@Service
public class GenerarNumeroUnicoService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	GenerarNumeroUnicoDAO generarNumeroUnicoDAO;
	
	public GenerarNumeroUnicoResponse generarNumeroUnico(GenerarNumeroUnicoRequest generarNumeroUnicoRequest) throws Exception{
		
		logger.info("Iniciando GeneraNumeroUnicoService - genrarNumeroUnico:  "+generarNumeroUnicoRequest);
		
		GenerarNumeroUnicoResponse generarNumeroUnicoResponse = new GenerarNumeroUnicoResponse();
		
		try {
			
			List<GenerarNumeroUnicoRq> listGenerarNumero = new ArrayList<GenerarNumeroUnicoRq>();
			
			Optional<GenerarNumeroUnicoRq> optional = generarNumeroUnicoDAO.findById(1L);
			
			System.out.println("listGeneraNumero:  "+optional);
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		}
		
		return generarNumeroUnicoResponse;
		
	}
	
}
