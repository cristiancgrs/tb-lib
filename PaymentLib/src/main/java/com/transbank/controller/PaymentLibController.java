package com.transbank.controller;

import org.springframework.web.bind.annotation.RestController;

import com.transbank.lib.dto.TransactionReq;
import com.transbank.lib.dto.TransactionResp;

@RestController
public class PaymentLibController {

	public TransactionResp parseJsonToSpdh(TransactionReq transactionReq) throws Exception {
		
		TransactionResp transactionResp = new TransactionResp();
		
		try {
			
			
			
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
		
		return transactionResp;
	}
	
}
