package com.transbank.mpos.paymentlib.dto;

public class PaymentLibResponse extends Operacion{

	private String spdh;

	public String getSpdh() {
		return spdh;
	}

	public void setSpdh(String spdh) {
		this.spdh = spdh;
	}

	@Override
	public String toString() {
		return "PaymentLibResponse [spdh=" + spdh + "]";
	}
	
}
