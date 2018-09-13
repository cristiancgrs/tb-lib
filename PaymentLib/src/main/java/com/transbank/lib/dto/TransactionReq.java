package com.transbank.lib.dto;

import java.io.Serializable;

public class TransactionReq implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String uuid;
	private String monto;
	private String trx;
	private String tipoTarjeta;
	private String pinBlockKsn;
	private String versionApp;
	private String macEncriptado;
	private String transmissionNumber;
	private String ddll;
	private String transactionCode;
	private String codeComercio;
	private String numModelo;
	private String serialNumber;
	private String tracks;
	private Odol odol;
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getTrx() {
		return trx;
	}
	public void setTrx(String trx) {
		this.trx = trx;
	}
	public String getTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(String tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	public String getPinBlockKsn() {
		return pinBlockKsn;
	}
	public void setPinBlockKsn(String pinBlockKsn) {
		this.pinBlockKsn = pinBlockKsn;
	}
	public String getVersionApp() {
		return versionApp;
	}
	public void setVersionApp(String versionApp) {
		this.versionApp = versionApp;
	}
	public String getMacEncriptado() {
		return macEncriptado;
	}
	public void setMacEncriptado(String macEncriptado) {
		this.macEncriptado = macEncriptado;
	}
	public String getTransmissionNumber() {
		return transmissionNumber;
	}
	public void setTransmissionNumber(String transmissionNumber) {
		this.transmissionNumber = transmissionNumber;
	}
	public String getDdll() {
		return ddll;
	}
	public void setDdll(String ddll) {
		this.ddll = ddll;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getCodeComercio() {
		return codeComercio;
	}
	public void setCodeComercio(String codeComercio) {
		this.codeComercio = codeComercio;
	}
	public String getNumModelo() {
		return numModelo;
	}
	public void setNumModelo(String numModelo) {
		this.numModelo = numModelo;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getTracks() {
		return tracks;
	}
	public void setTracks(String tracks) {
		this.tracks = tracks;
	}
	public Odol getOdol() {
		return odol;
	}
	public void setOdol(Odol odol) {
		this.odol = odol;
	}
	
	@Override
	public String toString() {
		return "Transaction [uuid=" + uuid + ", monto=" + monto + ", trx=" + trx + ", tipoTarjeta=" + tipoTarjeta
				+ ", pinBlockKsn=" + pinBlockKsn + ", versionApp=" + versionApp + ", macEncriptado=" + macEncriptado
				+ ", transmissionNumber=" + transmissionNumber + ", ddll=" + ddll + ", transactionCode="
				+ transactionCode + ", codeComercio=" + codeComercio + ", numModelo=" + numModelo + ", serialNumber="
				+ serialNumber + ", tracks=" + tracks + ", odol=" + odol + "]";
	}	
	
}
