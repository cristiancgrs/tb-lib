package com.transbank.mpos.dto;

import java.io.Serializable;

public class MposResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String campoB;

	public String getCampoB() {
		return campoB;
	}

	public void setCampoB(String campoB) {
		this.campoB = campoB;
	}

	@Override
	public String toString() {
		return "MposResponse [campoB=" + campoB + "]";
	}

}
