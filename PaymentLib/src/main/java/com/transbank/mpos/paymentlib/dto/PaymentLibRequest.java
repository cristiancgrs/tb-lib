package com.transbank.mpos.paymentlib.dto;

import java.io.Serializable;

public class PaymentLibRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Header header;
	private String monto;
	private String numeroBoleta;
	private String numeroEmpleado;
	private String macEncriptado;
	private String flagCaptura;
	private String datosContexto;
	private DatosTransbank datosTransbank;
	private String pinBlock;
	private String codigoComercio;
	private String terminalConditionCode;
	private NumerosSecuencia numerosSecuencia;
	private DatosTerminal datosTerminal;
	private TipoVenta tipoVenta;
	private DatosPuntoVenta datosPuntoVenta;
	private Cuota cuota;
	private String fidsEncriptado;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getNumeroBoleta() {
		return numeroBoleta;
	}
	public void setNumeroBoleta(String numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}
	public String getNumeroEmpleado() {
		return numeroEmpleado;
	}
	public void setNumeroEmpleado(String numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	public String getMacEncriptado() {
		return macEncriptado;
	}
	public void setMacEncriptado(String macEncriptado) {
		this.macEncriptado = macEncriptado;
	}
	public String getFlagCaptura() {
		return flagCaptura;
	}
	public void setFlagCaptura(String flagCaptura) {
		this.flagCaptura = flagCaptura;
	}
	public String getDatosContexto() {
		return datosContexto;
	}
	public void setDatosContexto(String datosContexto) {
		this.datosContexto = datosContexto;
	}
	public DatosTransbank getDatosTransbank() {
		return datosTransbank;
	}
	public void setDatosTransbank(DatosTransbank datosTransbank) {
		this.datosTransbank = datosTransbank;
	}
	public String getPinBlock() {
		return pinBlock;
	}
	public void setPinBlock(String pinBlock) {
		this.pinBlock = pinBlock;
	}
	public String getCodigoComercio() {
		return codigoComercio;
	}
	public void setCodigoComercio(String codigoComercio) {
		this.codigoComercio = codigoComercio;
	}
	public String getTerminalConditionCode() {
		return terminalConditionCode;
	}
	public void setTerminalConditionCode(String terminalConditionCode) {
		this.terminalConditionCode = terminalConditionCode;
	}
	public NumerosSecuencia getNumerosSecuencia() {
		return numerosSecuencia;
	}
	public void setNumerosSecuencia(NumerosSecuencia numerosSecuencia) {
		this.numerosSecuencia = numerosSecuencia;
	}
	public DatosTerminal getDatosTerminal() {
		return datosTerminal;
	}
	public void setDatosTerminal(DatosTerminal datosTerminal) {
		this.datosTerminal = datosTerminal;
	}
	public TipoVenta getTipoVenta() {
		return tipoVenta;
	}
	public void setTipoVenta(TipoVenta tipoVenta) {
		this.tipoVenta = tipoVenta;
	}
	public DatosPuntoVenta getDatosPuntoVenta() {
		return datosPuntoVenta;
	}
	public void setDatosPuntoVenta(DatosPuntoVenta datosPuntoVenta) {
		this.datosPuntoVenta = datosPuntoVenta;
	}
	public Cuota getCuota() {
		return cuota;
	}
	public void setCuota(Cuota cuota) {
		this.cuota = cuota;
	}
	public String getFidsEncriptado() {
		return fidsEncriptado;
	}
	public void setFidsEncriptado(String fidsEncriptado) {
		this.fidsEncriptado = fidsEncriptado;
	}
	
	@Override
	public String toString() {
		return "PaymentLibRequest [header=" + header + ", monto=" + monto + ", numeroBoleta=" + numeroBoleta
				+ ", numeroEmpleado=" + numeroEmpleado + ", macEncriptado=" + macEncriptado + ", flagCaptura="
				+ flagCaptura + ", datosContexto=" + datosContexto + ", datosTransbank=" + datosTransbank
				+ ", pinBlock=" + pinBlock + ", codigoComercio=" + codigoComercio + ", terminalConditionCode="
				+ terminalConditionCode + ", numerosSecuencia=" + numerosSecuencia + ", datosTerminal=" + datosTerminal
				+ ", tipoVenta=" + tipoVenta + ", datosPuntoVenta=" + datosPuntoVenta + ", cuota=" + cuota
				+ ", fidsEncriptado=" + fidsEncriptado + "]";
	}
	
}
