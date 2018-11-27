package com.transbank.mpos.paymentlib.dto;

public class TipoVenta {
	private String modoCapturaPAN;
	private String moneda;
	private String envChip;
	private String envChipCless;
	private String keySerialNumber;
	
	public String getModoCapturaPAN() {
		return modoCapturaPAN;
	}
	public void setModoCapturaPAN(String modoCapturaPAN) {
		this.modoCapturaPAN = modoCapturaPAN;
	}
	public String getMoneda() {
		return moneda;
	}
	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	public String getEnvChip() {
		return envChip;
	}
	public void setEnvChip(String envChip) {
		this.envChip = envChip;
	}
	public String getEnvChipCless() {
		return envChipCless;
	}
	public void setEnvChipCless(String envChipCless) {
		this.envChipCless = envChipCless;
	}
	public String getKeySerialNumber() {
		return keySerialNumber;
	}
	public void setKeySerialNumber(String keySerialNumber) {
		this.keySerialNumber = keySerialNumber;
	}
	
	@Override
	public String toString() {
		return "TipoVenta [modoCapturaPAN=" + modoCapturaPAN + ", moneda=" + moneda + ", envChip=" + envChip
				+ ", envChipCless=" + envChipCless + ", keySerialNumber=" + keySerialNumber + "]";
	}
	
}
