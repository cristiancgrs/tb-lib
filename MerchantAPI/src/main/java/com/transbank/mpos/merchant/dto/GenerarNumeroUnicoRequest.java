package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

public class GenerarNumeroUnicoRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigoComercio;

	public String getCodigoComercio() {
		return codigoComercio;
	}

	public void setCodigoComercio(String codigoComercio) {
		this.codigoComercio = codigoComercio;
	}

	@Override
	public String toString() {
		return "GeneraNumeroUnicoRequest [codigoComercio=" + codigoComercio + "]";
	}
	

}
