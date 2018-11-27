package com.transbank.mpos.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class MposRequest implements Serializable{
	
	@NotNull
	@Pattern(regexp="[0-9]*$", message="El monto debe tener unicamente valores numéricos")
	private String monto;
	private String apiKey;
	private String uuid;
	private String versionApp;
	private String transmissionNumber;
	private String ddll;
	private String transactionCode;
	private String codeComercio;
	private String numeroUnico;
	private String numeroSecuencia;
	private String numeroModelo;
	private String serialNumber;
	private String tracks;
	private String objTarjeta;
	private String adol;
	private String odol;
	private String macEncriptado;
	private String tipoTrx;
	private String pinblockKsn;
	
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getVersionApp() {
		return versionApp;
	}
	public void setVersionApp(String versionApp) {
		this.versionApp = versionApp;
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
	public String getNumeroUnico() {
		return numeroUnico;
	}
	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	public String getNumeroSecuencia() {
		return numeroSecuencia;
	}
	public void setNumeroSecuencia(String numeroSecuencia) {
		this.numeroSecuencia = numeroSecuencia;
	}
	public String getNumeroModelo() {
		return numeroModelo;
	}
	public void setNumeroModelo(String numeroModelo) {
		this.numeroModelo = numeroModelo;
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
	public String getObjTarjeta() {
		return objTarjeta;
	}
	public void setObjTarjeta(String objTarjeta) {
		this.objTarjeta = objTarjeta;
	}
	public String getAdol() {
		return adol;
	}
	public void setAdol(String adol) {
		this.adol = adol;
	}
	public String getOdol() {
		return odol;
	}
	public void setOdol(String odol) {
		this.odol = odol;
	}
	public String getMacEncriptado() {
		return macEncriptado;
	}
	public void setMacEncriptado(String macEncriptado) {
		this.macEncriptado = macEncriptado;
	}
	public String getTipoTrx() {
		return tipoTrx;
	}
	public void setTipoTrx(String tipoTrx) {
		this.tipoTrx = tipoTrx;
	}
	public String getPinblockKsn() {
		return pinblockKsn;
	}
	public void setPinblockKsn(String pinblockKsn) {
		this.pinblockKsn = pinblockKsn;
	}
	
	@Override
	public String toString() {
		return "MposRequest [monto=" + monto + ", apiKey=" + apiKey + ", uuid=" + uuid + ", versionApp=" + versionApp
				+ ", transmissionNumber=" + transmissionNumber + ", ddll=" + ddll + ", transactionCode="
				+ transactionCode + ", codeComercio=" + codeComercio + ", numeroUnico=" + numeroUnico
				+ ", numeroSecuencia=" + numeroSecuencia + ", numeroModelo=" + numeroModelo + ", serialNumber="
				+ serialNumber + ", tracks=" + tracks + ", objTarjeta=" + objTarjeta + ", adol=" + adol + ", odol="
				+ odol + ", macEncriptado=" + macEncriptado + ", tipoTrx=" + tipoTrx + ", pinblockKsn=" + pinblockKsn
				+ "]";
	}

}
