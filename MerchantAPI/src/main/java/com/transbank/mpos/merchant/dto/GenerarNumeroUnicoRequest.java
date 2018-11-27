package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

public class GenerarNumeroUnicoRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long codigoComercio;

	public Long getCodigoComercio() {
		return codigoComercio;
	}

	public void setCodigoComercio(Long codigoComercio) {
		this.codigoComercio = codigoComercio;
	}

	@Override
	public String toString() {
		return "GeneraNumeroUnicoRequest [codigoComercio=" + codigoComercio + "]";
	}
	

}
