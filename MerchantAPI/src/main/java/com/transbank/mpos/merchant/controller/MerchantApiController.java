package com.transbank.mpos.merchant.controller;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoRequest;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoResponse;
import com.transbank.mpos.merchant.service.GenerarNumeroUnicoService;

@RestController
public class MerchantApiController {
	
	@Autowired
	GenerarNumeroUnicoService generarNumeroUnicoService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/generarNumeroUnico", method=RequestMethod.POST)
	@ResponseBody
	public GenerarNumeroUnicoResponse generarNumeroUnico(@RequestBody GenerarNumeroUnicoRequest generarNumeroUnicoRequest, 
			HttpServletResponse response) throws Exception{
		
		logger.info("Iniciando MerchantApiController - generarNumeroUnico:  "+generarNumeroUnicoRequest);
		
		try {
			
			return generarNumeroUnicoService.generarNumeroUnico(generarNumeroUnicoRequest, response);
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e.getMessage());
		}
		
	}

}
