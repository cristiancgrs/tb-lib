package com.transbank.mpos.paymentlib.dto;

public class Cuota {
	
	private String indicadorLargo;
	private String flagPermiteCuota;
	private String flagGracia;
	private String flagC2c;
	private String flagC3c;
	private String flagNCuotas;
	private String flagMaximoCuotas;
	private String tipoMenu;
	private String tipoTarjeta;
	private String marcaTarjeta;
	public String getIndicadorLargo() {
		return indicadorLargo;
	}
	public void setIndicadorLargo(String indicadorLargo) {
		this.indicadorLargo = indicadorLargo;
	}
	public String getFlagPermiteCuota() {
		return flagPermiteCuota;
	}
	public void setFlagPermiteCuota(String flagPermiteCuota) {
		this.flagPermiteCuota = flagPermiteCuota;
	}
	public String getFlagGracia() {
		return flagGracia;
	}
	public void setFlagGracia(String flagGracia) {
		this.flagGracia = flagGracia;
	}
	public String getFlagC2c() {
		return flagC2c;
	}
	public void setFlagC2c(String flagC2c) {
		this.flagC2c = flagC2c;
	}
	public String getFlagC3c() {
		return flagC3c;
	}
	public void setFlagC3c(String flagC3c) {
		this.flagC3c = flagC3c;
	}
	public String getFlagNCuotas() {
		return flagNCuotas;
	}
	public void setFlagNCuotas(String flagNCuotas) {
		this.flagNCuotas = flagNCuotas;
	}
	public String getFlagMaximoCuotas() {
		return flagMaximoCuotas;
	}
	public void setFlagMaximoCuotas(String flagMaximoCuotas) {
		this.flagMaximoCuotas = flagMaximoCuotas;
	}
	public String getTipoMenu() {
		return tipoMenu;
	}
	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getMarcaTarjeta() {
		return marcaTarjeta;
	}
	public void setMarcaTarjeta(String marcaTarjeta) {
		this.marcaTarjeta = marcaTarjeta;
	}
	@Override
	public String toString() {
		return "Cuota [indicadorLargo=" + indicadorLargo + ", flagPermiteCuota=" + flagPermiteCuota + ", flagGracia="
				+ flagGracia + ", flagC2c=" + flagC2c + ", flagC3c=" + flagC3c + ", flagNCuotas=" + flagNCuotas
				+ ", flagMaximoCuotas=" + flagMaximoCuotas + ", tipoMenu=" + tipoMenu + ", tipoTarjeta=" + tipoTarjeta
				+ ", marcaTarjeta=" + marcaTarjeta + "]";
	}
	
}
