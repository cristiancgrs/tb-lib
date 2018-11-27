package com.transbank.lib.dto;

import java.util.List;

public class TransactionReq{
	
	private Header header;
	private List<String> fidsList;
	private String encriptedFids;
//	private String uuid;
//	private String monto;
//	private String trx;
//	private String tipoTarjeta;
//	private String pinBlockKsn;
//	private String versionApp;
//	private String macEncriptado;
//	private String transmissionNumber;
//	private String ddll;
//	private String transactionCode;
//	private String codeComercio;
//	private String numModelo;
//	private String serialNumber;
//	private String tracks;
//	private Odol odol;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public List<String> getFidsList() {
		return fidsList;
	}
	public void setFidsList(List<String> fidsList) {
		this.fidsList = fidsList;
	}
	public String getEncriptedFids() {
		return encriptedFids;
	}
	public void setEncriptedFids(String encriptedFids) {
		this.encriptedFids = encriptedFids;
	}
	
	@Override
	public String toString() {
		return "TransactionReq [header=" + header + ", fidsList=" + fidsList + ", encriptedFids=" + encriptedFids + "]";
	}
	
}
