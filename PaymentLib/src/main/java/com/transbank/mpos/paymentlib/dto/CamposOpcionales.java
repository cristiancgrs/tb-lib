package com.transbank.mpos.paymentlib.dto;

public class CamposOpcionales {

	public enum Campos {
		OPCIONAL("numeroBoleta");
		
		private String campo;
		
		Campos(String campo){
			this.campo = campo;
		}
		
		public String campo() {
			return campo;
		}
		
	}
	
	
}
