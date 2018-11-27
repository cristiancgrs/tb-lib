package com.transbank.mpos.paymentlib.dto;

public class DatosTransbank {
	private String numeroUnico;

	public String getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	@Override
	public String toString() {
		return "DatosTransbank [numeroUnico=" + numeroUnico + "]";
	}
	
}
