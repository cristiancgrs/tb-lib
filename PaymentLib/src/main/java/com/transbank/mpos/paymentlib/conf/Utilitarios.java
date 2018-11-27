package com.transbank.mpos.paymentlib.conf;

import java.util.Map;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.transbank.mpos.paymentlib.dto.Constantes;

public class Utilitarios {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String armarFiller(int cantidad, String valor) {
		
		logger.info("Iniciando Utilitarios - armarFiller:  "+cantidad+" ; "+valor);
		
		String filler = new String(); 
		
		for (int i = 0; i < cantidad; i++) {
			filler += valor;
		}
		
		return filler;
	}
	
	public String validarParametroNull(JSONObject jsonRequest) {
		
		logger.info("Iniciando Utilitarios - validarParametroNull:  "+jsonRequest);
		
		Map<String, String> mapConstantes = Constantes.CONSTANTE_PARAMETROS_OBLIGATORIO.get("obligatorio");
		
		boolean parametroObligatorio = false;
		 
		for (Map.Entry<String, String> entry : mapConstantes.entrySet()) {
		    parametroObligatorio = false;
		    schiffe_loop:
		    for (Object key : jsonRequest.keySet()) {
		        String keyStr = (String)key;
		        Object keyvalue = jsonRequest.get(keyStr);
		        
		        if(entry.getKey().equals(keyStr)) {
		        	parametroObligatorio = true;
		        	break;
		        }
		        
		        if(keyvalue instanceof JSONObject) {
		        	for (Object key2 : ((JSONObject) keyvalue).keySet()) {
		        		String keyStr2 = (String)key2;
		        				        		
		        		if(entry.getKey().equals(keyStr2)) {
				        	parametroObligatorio = true;
				        	break schiffe_loop;
				        }
		        		
		        	}
		        }
		        
		    }
		    
		    if(!parametroObligatorio) {
		    	return "El campo "+entry.getKey()+" es obligatorio";
		    }
		}
		
		
		return "";
		
	}
	
	public boolean validarExistenciaParametro(String tipoConstante, String parametro) throws Exception{
		
		logger.info("Iniciando Utilitarios - consultarExistenciaConstante:  "+tipoConstante+" ; "+parametro);
		 
		 Map<String, String> mapConstantes = Constantes.CONSTANTE_PARAMETROS_OBLIGATORIO.get(tipoConstante);
		 
		 if(mapConstantes.containsKey(parametro)) {
			 return true;
		 }
		 return false;
	 }
	
	public String validarJsonParametros(JSONObject jsonObject) throws Exception{
		
		logger.info("Iniciando Utilitarios - validarJsonParametrosNull:  "+jsonObject.toString());
		
		String resultadoValidacion = new String("");
		
		try {
			
			String resultadoValidarParametroNull = validarParametroNull(jsonObject);
			
			if(!"".equals(resultadoValidarParametroNull)) {
				return resultadoValidarParametroNull;
			}
			
			for (Object key : jsonObject.keySet()) {
		        String keyStr = (String)key;
		        Object keyvalue = jsonObject.get(keyStr);
		        
		        resultadoValidacion = validarParametro(keyStr, keyvalue.toString());
		        
		        if(!"".equals(resultadoValidacion)) {
		        	return resultadoValidacion;
		        }
		        
		        if(keyvalue instanceof JSONObject) {
		        	for (Object key2 : ((JSONObject) keyvalue).keySet()) {
		        		String keyStr2 = (String)key2;
		        		Object keyvalue2 = ((JSONObject)keyvalue).get(keyStr2);
		        		
		        		resultadoValidacion = validarParametro(keyStr2, keyvalue2.toString());
		        		
		        		if(!"".equals(resultadoValidacion)) {
		        			return resultadoValidacion;
		        		}
		        		
		        	}
		        }
		        
		    }
			
		}catch(Exception e) {
			logger.error(e.toString());
			throw new Exception(e);
		}
		
		return resultadoValidacion;
		
	}
	
	
	public String validarParametro(String parametro, String valorParametro) throws Exception{
		
		logger.info("Iniciando Utilitarios - validarParametroObligatorio:  "+parametro+" ; "+valorParametro);
		
		String resultadoValidarFormatoParametro = new String("");
		
		if(valorParametro.trim().isEmpty()) {
			if(validarExistenciaParametro("obligatorio", parametro)) {
				return resultadoValidarFormatoParametro = "El campo '"+parametro+"' es obligatorio";
			}
		}

		resultadoValidarFormatoParametro = validarFormato(valorParametro, "obligatorio", parametro);
		
		return resultadoValidarFormatoParametro;
	}
	
	
	public String validarFormato(String valorParametro, String tipoConstante, String parametro) throws Exception{
		
		logger.info("Iniciando Utilitarios - consultarExistenciaConstante:  "+valorParametro+" ; "+tipoConstante+" ; "+parametro);
		 		 
		 Map<String, String> mapConstantes = Constantes.CONSTANTE_FORMATO_PARAMETROS.get(tipoConstante);
		 
		 String resultadoValidarFormatoParametro = "";
		 
		 if(mapConstantes.containsKey(parametro)) {
			 
			 if(!"".equals(mapConstantes.get(parametro)) && !"".equals(valorParametro)) {
				 resultadoValidarFormatoParametro = validarFormatoParametro(parametro, valorParametro, mapConstantes.get(parametro));
			 }
			 
		 }
		 
		 return resultadoValidarFormatoParametro;
	 }
	
	public String validarFormatoParametro(String parametro, String valorParametro, String expresionRegular) throws Exception {
		
		logger.info("Iniciando Utilitarios - validarFormatoParametro:  "+parametro+" ; "+valorParametro+" ; "+expresionRegular);
		
		String resultadoValidarFormatoParametro = "";
		
		try {
			
			/*
			 * TODO Crear constantes de mensajes genericos
			 */
			if(!valorParametro.matches(expresionRegular)) {
//				System.out.println("No cumple con el formato valido");
				resultadoValidarFormatoParametro = "El formato del parametro "+parametro+" es inválido";
			}
						
		}catch(Exception e) {
			throw new Exception(e);
		}
		
		return resultadoValidarFormatoParametro;
		
	}
	
	
	
}
