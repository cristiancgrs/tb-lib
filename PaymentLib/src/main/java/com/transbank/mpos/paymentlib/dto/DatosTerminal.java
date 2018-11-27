package com.transbank.mpos.paymentlib.dto;

public class DatosTerminal {
	private String modeloEquipo;
	private String numeroSerialTerminal;
	private String numeroSeriePinPad;
	private String versionPrograma;
	
	public String getModeloEquipo() {
		return modeloEquipo;
	}
	public void setModeloEquipo(String modeloEquipo) {
		this.modeloEquipo = modeloEquipo;
	}
	public String getNumeroSerialTerminal() {
		return numeroSerialTerminal;
	}
	public void setNumeroSerialTerminal(String numeroSerialTerminal) {
		this.numeroSerialTerminal = numeroSerialTerminal;
	}
	public String getNumeroSeriePinPad() {
		return numeroSeriePinPad;
	}
	public void setNumeroSeriePinPad(String numeroSeriePinPad) {
		this.numeroSeriePinPad = numeroSeriePinPad;
	}
	public String getVersionPrograma() {
		return versionPrograma;
	}
	public void setVersionPrograma(String versionPrograma) {
		this.versionPrograma = versionPrograma;
	}
	
	@Override
	public String toString() {
		return "DatosTerminal [modeloEquipo=" + modeloEquipo + ", numeroSerialTerminal=" + numeroSerialTerminal
				+ ", numeroSeriePinPad=" + numeroSeriePinPad + ", versionPrograma=" + versionPrograma + "]";
	}
	
}
