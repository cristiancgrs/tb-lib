package com.transbank.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.transbank.lib.dto.TransactionReq;
import com.transbank.lib.dto.TransactionResp;
import com.transbank.lib.service.SpdhService;

@RestController
public class SpdhController {

	@Autowired
	SpdhService spdhService;
	
	/**
	 * @param transactionReq
	 * @return transactionResp
	 */
	@RequestMapping(value="/jsontospdh", method=RequestMethod.POST)
	public TransactionResp getContactsById(@RequestBody TransactionReq transactionReq){
		return spdhService.parseJsonToSpdh(transactionReq);
	}
	
}
