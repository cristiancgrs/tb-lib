package com.transbank.lib.dto;

public class Odol {

	private String pinBlock;
	private String ksn;
	private String fidsEncriptados;
	private String cryptogramInformationData;
	private String codPaisTerminal;
	private String fechaEmv;
	private String criptogramaSolicitudAutorizacion;
	private String perfilIntercambioAplicacion;
	private String contadorAplicacionTransaccion;
	private String numeroAleatorio;
	private String resultadoVerificacionTerminal;
	private String tipoTransaccion;
	private String codigoMoneda;
	private String montoAutorizado;
	private String otraCantidad;
	private String datosEmisor;
	
	public String getPinBlock() {
		return pinBlock;
	}
	public void setPinBlock(String pinBlock) {
		this.pinBlock = pinBlock;
	}
	public String getKsn() {
		return ksn;
	}
	public void setKsn(String ksn) {
		this.ksn = ksn;
	}
	public String getFidsEncriptados() {
		return fidsEncriptados;
	}
	public void setFidsEncriptados(String fidsEncriptados) {
		this.fidsEncriptados = fidsEncriptados;
	}
	public String getCryptogramInformationData() {
		return cryptogramInformationData;
	}
	public void setCryptogramInformationData(String cryptogramInformationData) {
		this.cryptogramInformationData = cryptogramInformationData;
	}
	public String getCodPaisTerminal() {
		return codPaisTerminal;
	}
	public void setCodPaisTerminal(String codPaisTerminal) {
		this.codPaisTerminal = codPaisTerminal;
	}
	public String getFechaEmv() {
		return fechaEmv;
	}
	public void setFechaEmv(String fechaEmv) {
		this.fechaEmv = fechaEmv;
	}
	public String getCriptogramaSolicitudAutorizacion() {
		return criptogramaSolicitudAutorizacion;
	}
	public void setCriptogramaSolicitudAutorizacion(String criptogramaSolicitudAutorizacion) {
		this.criptogramaSolicitudAutorizacion = criptogramaSolicitudAutorizacion;
	}
	public String getPerfilIntercambioAplicacion() {
		return perfilIntercambioAplicacion;
	}
	public void setPerfilIntercambioAplicacion(String perfilIntercambioAplicacion) {
		this.perfilIntercambioAplicacion = perfilIntercambioAplicacion;
	}
	public String getContadorAplicacionTransaccion() {
		return contadorAplicacionTransaccion;
	}
	public void setContadorAplicacionTransaccion(String contadorAplicacionTransaccion) {
		this.contadorAplicacionTransaccion = contadorAplicacionTransaccion;
	}
	public String getNumeroAleatorio() {
		return numeroAleatorio;
	}
	public void setNumeroAleatorio(String numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}
	public String getResultadoVerificacionTerminal() {
		return resultadoVerificacionTerminal;
	}
	public void setResultadoVerificacionTerminal(String resultadoVerificacionTerminal) {
		this.resultadoVerificacionTerminal = resultadoVerificacionTerminal;
	}
	public String getTipoTransaccion() {
		return tipoTransaccion;
	}
	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}
	public String getCodigoMoneda() {
		return codigoMoneda;
	}
	public void setCodigoMoneda(String codigoMoneda) {
		this.codigoMoneda = codigoMoneda;
	}
	public String getMontoAutorizado() {
		return montoAutorizado;
	}
	public void setMontoAutorizado(String montoAutorizado) {
		this.montoAutorizado = montoAutorizado;
	}
	public String getOtraCantidad() {
		return otraCantidad;
	}
	public void setOtraCantidad(String otraCantidad) {
		this.otraCantidad = otraCantidad;
	}
	public String getDatosEmisor() {
		return datosEmisor;
	}
	public void setDatosEmisor(String datosEmisor) {
		this.datosEmisor = datosEmisor;
	}
	
	@Override
	public String toString() {
		return "Odol [pinBlock=" + pinBlock + ", ksn=" + ksn + ", fidsEncriptados=" + fidsEncriptados
				+ ", cryptogramInformationData=" + cryptogramInformationData + ", codPaisTerminal=" + codPaisTerminal
				+ ", fechaEmv=" + fechaEmv + ", criptogramaSolicitudAutorizacion=" + criptogramaSolicitudAutorizacion
				+ ", perfilIntercambioAplicacion=" + perfilIntercambioAplicacion + ", contadorAplicacionTransaccion="
				+ contadorAplicacionTransaccion + ", numeroAleatorio=" + numeroAleatorio
				+ ", resultadoVerificacionTerminal=" + resultadoVerificacionTerminal + ", tipoTransaccion="
				+ tipoTransaccion + ", codigoMoneda=" + codigoMoneda + ", montoAutorizado=" + montoAutorizado
				+ ", otraCantidad=" + otraCantidad + ", datosEmisor=" + datosEmisor + "]";
	}
	
}
