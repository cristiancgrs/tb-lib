package com.transbank.mpos.paymentlib.dto;

public class DatosPuntoVenta {
	private String codServicioPinCredito;
	private String pinCredito;
	private String datosTransaccion;
	private String prepago;
	private String pagoExpress;
	
	public String getCodServicioPinCredito() {
		return codServicioPinCredito;
	}
	public void setCodServicioPinCredito(String codServicioPinCredito) {
		this.codServicioPinCredito = codServicioPinCredito;
	}
	public String getPinCredito() {
		return pinCredito;
	}
	public void setPinCredito(String pinCredito) {
		this.pinCredito = pinCredito;
	}
	public String getDatosTransaccion() {
		return datosTransaccion;
	}
	public void setDatosTransaccion(String datosTransaccion) {
		this.datosTransaccion = datosTransaccion;
	}
	public String getPrepago() {
		return prepago;
	}
	public void setPrepago(String prepago) {
		this.prepago = prepago;
	}
	public String getPagoExpress() {
		return pagoExpress;
	}
	public void setPagoExpress(String pagoExpress) {
		this.pagoExpress = pagoExpress;
	}
	@Override
	public String toString() {
		return "DatosPuntoVenta [codServicioPinCredito=" + codServicioPinCredito + ", pinCredito=" + pinCredito
				+ ", datosTransaccion=" + datosTransaccion + ", prepago=" + prepago + ", pagoExpress=" + pagoExpress
				+ "]";
	}
	
}
