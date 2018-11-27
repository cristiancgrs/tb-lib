package com.transbank.mpos.paymentlib.dto;

public class Operacion {

	private String codigoOperacion;
	private String mensajeOperacion;
	
	public Operacion() {
		setCodigoOperacion("0");
		setMensajeOperacion("Operación Exitosa");
	}
	
	public String getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(String codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	public String getMensajeOperacion() {
		return mensajeOperacion;
	}
	public void setMensajeOperacion(String mensajeOperacion) {
		this.mensajeOperacion = mensajeOperacion;
	}
	
	@Override
	public String toString() {
		return "Operacion [codigoOperacion=" + codigoOperacion + ", mensajeOperacion=" + mensajeOperacion + "]";
	}
	
}
