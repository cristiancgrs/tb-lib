package com.transbank.mpos.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.transbank.mpos.dto.MposRequest;
import com.transbank.mpos.dto.MposResponse;
import com.transbank.mpos.service.MposTraductorService;

@RestController
public class MposTraductorController {

	@Autowired
	MposTraductorService mposTraductorService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/transformarMposRequest", method=RequestMethod.POST)
	public MposResponse transformarMposRequest(@RequestBody @Valid MposRequest mposRequest) {
		
		logger.info("info - Iniciando Controller");
		System.out.println("Iniciando Controller");
		MposResponse mposResponse = mposTraductorService.transformarMposRequest(mposRequest);
		
		return mposResponse;
	}
	
}
