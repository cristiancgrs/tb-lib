package com.transbank.mpos.paymentlib.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transbank.mpos.paymentlib.dto.PaymentLibRequest;
import com.transbank.mpos.paymentlib.dto.PaymentLibResponse;
import com.transbank.mpos.paymentlib.service.PaymentLibService;

@PropertySource("classpath:payment-lib.properties")
@RestController
public class PaymentLibController {
	
	@Autowired
	PaymentLibService paymentLibService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/parseJsonToSPDH", method=RequestMethod.POST)
	public PaymentLibResponse parseJsonToSPDH(@RequestBody @Valid PaymentLibRequest paymentLibRequest) throws Exception{
		
		logger.info("Iniciando PaymentLibController - parseJsonToSPDH:  "+paymentLibRequest);
				
		try {
			
			return paymentLibService.parseJsonToSPDH(paymentLibRequest);
			
		}catch(Exception e) {
			logger.info(e.getMessage());
			throw new Exception(e);
		}
		
	}

}
