package com.transbank.mpos.paymentlib.dto;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Constantes {
		
	public static final java.util.Map<String, Map<String,String>> CONSTANTE_FORMATO_PARAMETROS;
	 
	 static {
	        Map<String, Map<String, String>> map = new HashMap<String, Map<String,String>>();
	        
	        Map<String, String> parametroRegexpMap = new HashMap<String, String>();
	        parametroRegexpMap.put("header", "");
	        parametroRegexpMap.put("transmissionNumber", "[0-9]{2}$");
	        parametroRegexpMap.put("terminalId", "^[A-Za-z0-9_]{16}$");
	        parametroRegexpMap.put("currentDate", "^((\\d{2}((0[13578]|1[02])(0[1-9]|[12]\\d|3[01])|(0[13456789]|1[012])(0[1-9]|[12]\\d|30)|02(0[1-9]|1\\d|2[0-8])))|([02468][048]|[13579][26])0229)$");
	        parametroRegexpMap.put("currentTime", "[0-9]{6}$");
	        parametroRegexpMap.put("messageTime", "[O]|[F]{1}$");
	        parametroRegexpMap.put("messageSubType", "[O]|[F]{1}$");
	        parametroRegexpMap.put("transactionCode", "[0-9]{2}$");
	        parametroRegexpMap.put("processingFlag2", "[0]|[5]{1}$");
	        parametroRegexpMap.put("monto", "[0-9]{4,18}$");
	        parametroRegexpMap.put("macEncriptado", "^[A-Za-z0-9_]{8}$");
	        parametroRegexpMap.put("flagCaptura", "[0-1]{1}$");
	        parametroRegexpMap.put("datosContexto", "^[A-Za-z0-9_]{16}$");
	        parametroRegexpMap.put("datosTransbank", "");
	        parametroRegexpMap.put("numeroUnico", "^[(NU)(0-9_)]{28}$");
	        parametroRegexpMap.put("pinBlock", "^[A-Za-z0-9_]{16}$");
	        parametroRegexpMap.put("codigoComercio", "[0-9]{12}$");
	        parametroRegexpMap.put("terminalConditionCode", "(00|01|03|05|08|27)$");
	        parametroRegexpMap.put("numerosSecuencia", "");
	        parametroRegexpMap.put("numeroBatch", "^[0-9][0-9][0-9]?$|^999$");
	        parametroRegexpMap.put("secuencia", "^[0-9][0-9][0-9]?$|^999$");
	        parametroRegexpMap.put("datosTerminal","");
	        parametroRegexpMap.put("modeloEquipo","[0-9]{2}$");
	        parametroRegexpMap.put("numeroSerialTerminal","^[A-Za-z0-9_]{12}$");
	        parametroRegexpMap.put("numeroSeriePinPad","^[A-Za-z0-9_]{15}$");
	        parametroRegexpMap.put("versionPrograma","^[(?!\\.)(\\d+(\\.\\d+)+)]{5}$");
	        parametroRegexpMap.put("tipoVenta","");
	        parametroRegexpMap.put("modoCapturaPAN","[0-9]{3}$");
	        parametroRegexpMap.put("moneda","[0-9]{3}$");
	        parametroRegexpMap.put("keySerialNumber","^[A-Za-z0-9_]{23}$");
	        parametroRegexpMap.put("envChip","^[A-Za-z0-9_\\ ]*$");
	        parametroRegexpMap.put("envChipCless","^[A-Za-z0-9_\\ ]*$");
	        parametroRegexpMap.put("datosPuntoVenta","");
	        parametroRegexpMap.put("codServicioPinCredito","^[A-Za-z0-9_\\ ]{0,98}$");
	        parametroRegexpMap.put("pinCredito","[0-9]{8}$");
	        parametroRegexpMap.put("datosTransaccion","[0-9]{4}$");
	        parametroRegexpMap.put("prepago", "[0-1]{1}$");
	        parametroRegexpMap.put("pagoExpress", "[0-9]{12}$");
	        parametroRegexpMap.put("cuota","");
	        parametroRegexpMap.put("indicadorLargo","[0-9]{3}$");
	        parametroRegexpMap.put("flagPermiteCuota","(0|1)$");
	        parametroRegexpMap.put("flagGracia","(0|1)$");
	        parametroRegexpMap.put("flagC2c","(0|1)$");
	        parametroRegexpMap.put("flagC3c","(0|1)$");
	        parametroRegexpMap.put("flagNCuotas","(0|1)$");
	        parametroRegexpMap.put("flagMaximoCuotas","[0-9]{2}$");
	        parametroRegexpMap.put("tipoMenu","(CR|DB|NB)$");
	        parametroRegexpMap.put("tipoTarjeta","^[A-Za-z0-9_]{1}$");
	        parametroRegexpMap.put("marcaTarjeta","^[A-Za-z0-9_]{2}$");
	        parametroRegexpMap.put("fidsEncriptado","^[A-Za-z0-9_]*$");
	        
	        map.put("obligatorio", parametroRegexpMap);
	        CONSTANTE_FORMATO_PARAMETROS = Collections.unmodifiableMap(map);
	    }
	 
public static final java.util.Map<String, Map<String,String>> CONSTANTE_PARAMETROS_OBLIGATORIO;
	 
	 static {
	        Map<String, Map<String, String>> map = new HashMap<String, Map<String,String>>();
	        
	        Map<String, String> parametroRegexpMap = new HashMap<String, String>();
	        parametroRegexpMap.put("header", "");
	        parametroRegexpMap.put("transmissionNumber", "");
	        parametroRegexpMap.put("terminalId", "");
	        parametroRegexpMap.put("currentDate", "");
	        parametroRegexpMap.put("currentTime", "");
	        parametroRegexpMap.put("messageTime", "");
	        parametroRegexpMap.put("messageSubType", "");
	        parametroRegexpMap.put("transactionCode", "");
	        parametroRegexpMap.put("processingFlag2", "");
	        parametroRegexpMap.put("monto", "");
	        parametroRegexpMap.put("macEncriptado", "");
	        parametroRegexpMap.put("flagCaptura", "");
	        parametroRegexpMap.put("datosContexto", "");
	        parametroRegexpMap.put("datosTransbank", "");
	        parametroRegexpMap.put("numeroUnico", "");
	        parametroRegexpMap.put("pinBlock", "");
	        parametroRegexpMap.put("codigoComercio", "");
	        parametroRegexpMap.put("terminalConditionCode", "");
	        parametroRegexpMap.put("numerosSecuencia", "");
	        parametroRegexpMap.put("numeroBatch", "");
	        parametroRegexpMap.put("secuencia", "");
	        parametroRegexpMap.put("datosTerminal","");
	        parametroRegexpMap.put("modeloEquipo","");
	        parametroRegexpMap.put("numeroSerialTerminal","");
	        parametroRegexpMap.put("numeroSeriePinPad","");
	        parametroRegexpMap.put("versionPrograma","");
	        parametroRegexpMap.put("tipoVenta","");
	        parametroRegexpMap.put("modoCapturaPAN","");
	        parametroRegexpMap.put("moneda","");
	        parametroRegexpMap.put("keySerialNumber","");
	        parametroRegexpMap.put("datosPuntoVenta","");
	        parametroRegexpMap.put("codServicioPinCredito","");
	        parametroRegexpMap.put("pinCredito","");
	        parametroRegexpMap.put("datosTransaccion","");
	        parametroRegexpMap.put("prepago", "");
	        parametroRegexpMap.put("pagoExpress", "");
	        parametroRegexpMap.put("cuota","");
	        parametroRegexpMap.put("indicadorLargo","");
	        parametroRegexpMap.put("flagPermiteCuota","");
	        parametroRegexpMap.put("flagGracia","");
	        parametroRegexpMap.put("flagC2c","");
	        parametroRegexpMap.put("flagC3c","");
	        parametroRegexpMap.put("flagNCuotas","");
	        parametroRegexpMap.put("flagMaximoCuotas","");
	        parametroRegexpMap.put("tipoMenu","");
	        parametroRegexpMap.put("fidsEncriptado","");
	        
	        map.put("obligatorio", parametroRegexpMap);
	        CONSTANTE_PARAMETROS_OBLIGATORIO = Collections.unmodifiableMap(map);
	    }
	 
	
}
