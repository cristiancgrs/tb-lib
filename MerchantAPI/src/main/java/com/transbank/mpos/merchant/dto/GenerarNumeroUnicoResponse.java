package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

public class GenerarNumeroUnicoResponse implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String numeroUnico;

	public String getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	@Override
	public String toString() {
		return "GenerarNumeroUnicoResponse [numeroUnico=" + numeroUnico + "]";
	}
	
}
