package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class GenerarNumeroUnicoRq{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "merchant_secuence")
    @SequenceGenerator(name = "merchant_secuence", sequenceName = "MERCHANT_SEQ")
	private Long codigoComercio;

	@Column(name="CDG_numeroUnicoTransaccion")
	private String numeroUnico;
	
	public GenerarNumeroUnicoRq() {
		
	}

	public Long getCodigoComercio() {
		return codigoComercio;
	}

	public void setCodigoComercio(Long codigoComercio) {
		this.codigoComercio = codigoComercio;
	}

	public String getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	
}
