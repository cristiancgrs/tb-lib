package com.transbank.lib.dto;

import java.io.Serializable;

public class TransactionResp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String spdh;
	
	
	public String getSpdh() {
		return spdh;
	}
	public void setSpdh(String spdh) {
		this.spdh = spdh;
	}
	
	@Override
	public String toString() {
		return "TransactionResp [spdh=" + spdh + "]";
	}
}
