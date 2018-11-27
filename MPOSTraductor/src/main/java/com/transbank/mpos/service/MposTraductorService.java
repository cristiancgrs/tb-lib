package com.transbank.mpos.service;

import org.springframework.stereotype.Service;

import com.transbank.mpos.dto.MposRequest;
import com.transbank.mpos.dto.MposResponse;

@Service
public class MposTraductorService {

	public MposResponse transformarMposRequest(MposRequest request) {
		
		System.out.println("iniciando Service");
		MposResponse mposResponse = new MposResponse();
		mposResponse.setCampoB("bien");
		return mposResponse;
	}
	
}
