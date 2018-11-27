package com.transbank.lib.dto;

public class TransactionResp {

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
