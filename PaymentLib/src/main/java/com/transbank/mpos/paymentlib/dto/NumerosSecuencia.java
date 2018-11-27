package com.transbank.mpos.paymentlib.dto;

public class NumerosSecuencia {
	private String numeroBatch;
	private String secuencia;
	
	public String getNumeroBatch() {
		return numeroBatch;
	}
	public void setNumeroBatch(String numeroBatch) {
		this.numeroBatch = numeroBatch;
	}
	public String getSecuencia() {
		return secuencia;
	}
	public void setSecuencia(String secuencia) {
		this.secuencia = secuencia;
	}
	
	@Override
	public String toString() {
		return "NumerosSecuencia [numeroBatch=" + numeroBatch + ", secuencia=" + secuencia + "]";
	}
		
}
