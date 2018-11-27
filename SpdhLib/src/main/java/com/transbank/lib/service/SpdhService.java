package com.transbank.lib.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.transbank.lib.dto.TransactionReq;
import com.transbank.lib.dto.TransactionResp;

/**
 * 
 * @author Everis
 *
 */
@Service
public class SpdhService {

	Logger logger = LoggerFactory.getLogger(SpdhService.class);
	private static final char FS = '\u001C';
	private static final char ETX = '\u0003';
	private static final String TIPOTARJETA = "debito";
	private static final String START = "00001";
	public static final char US = '\u001F'; // Transaction ends
	
	public TransactionResp parseJsonToSpdh(TransactionReq transactionReq) {
		
		logger.info("Iniciando parseJsonToSpdh");
		
		StringBuffer spdh = new StringBuffer();
		
		StringBuffer header = new StringBuffer();
		
		StringBuffer fid = new StringBuffer();
		
		//Se valida que el objeto venga con datos
		if(null != transactionReq) {
			
			//Se arma el HEADER
			header = setHeader(transactionReq);
			logger.info("header:  "+header);
			
			//Se arman los FID's
			fid = setFids(transactionReq.getFidsList());
			logger.info("fid:  "+fid);
			
			//Se concatena la estructura del spdh
			
			/**
			 * TODO Preguntar por que en el ejemplo se inicia con '00001'
			 */
			spdh.append(START);
			//Se agrega el header
			spdh.append(header);
			//Se agregan los fids
			spdh.append(fid);
			//Se agrega Caracter de control para indicar inicio de datos Encriptados
			spdh.append(US);
			//Se agrega fids encriptados
			spdh.append(transactionReq.getEncriptedFids());
			//Se agrega Caracter de control del fin del texto
			spdh.append(ETX);
			logger.info("sdph:  "+spdh);
			
		}
		
		TransactionResp transactionResp = new TransactionResp();
		
		transactionResp.setSpdh(spdh.toString());
		
		return transactionResp;
		
	}
	
	private StringBuffer setHeader(TransactionReq transactionReq) {
		
		StringBuffer header = new StringBuffer();
		
		header.append(transactionReq.getHeader().getDeviceType());
		header.append(transactionReq.getHeader().getTransmissionNumber());
		header.append(transactionReq.getHeader().getTerminalId());
		header.append(transactionReq.getHeader().getEmployeeId());
		header.append(transactionReq.getHeader().getCurrentDate());
		header.append(transactionReq.getHeader().getCurrentTime());
		header.append(transactionReq.getHeader().getMessageType());
		header.append(transactionReq.getHeader().getMessageSubType());
		header.append(transactionReq.getHeader().getTransactionCode());
		header.append(transactionReq.getHeader().getFlag1());
		header.append(transactionReq.getHeader().getFlag2());
		header.append(transactionReq.getHeader().getFlag3());
		header.append(transactionReq.getHeader().getResponseCode());
		
		return header;
		
	}
	
	private StringBuffer setFids(List<String> fidsList) {
		
		StringBuffer fids = new StringBuffer();
		
		for (String fid : fidsList) {
			
			fids.append(FS);
			fids.append(fid);
			
		}
		
		return fids;
		
	}
	
}
