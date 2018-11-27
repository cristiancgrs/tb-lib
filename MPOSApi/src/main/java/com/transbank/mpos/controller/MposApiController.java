package com.transbank.mpos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transbank.mpos.service.MposApiService;

@RestController
public class MposApiController {

	@Autowired
	MposApiService mposApiService;
	
	@RequestMapping(value="enviaPagoMpos", method=RequestMethod.POST)
	public Object enviaTransaccionMPOS(Object mposRequest) {
		
		Object obj = new Object();
		
		
		
		return obj;
	}
	
}
