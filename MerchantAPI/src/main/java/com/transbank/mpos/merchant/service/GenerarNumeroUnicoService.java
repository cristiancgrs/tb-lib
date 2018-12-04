package com.transbank.mpos.merchant.service;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transbank.mpos.merchant.dao.GenerarNumeroUnicoDAO;
import com.transbank.mpos.merchant.dto.Constantes;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoRequest;
import com.transbank.mpos.merchant.dto.GenerarNumeroUnicoResponse;
import com.transbank.mpos.merchant.dto.Operacion;

@Service
public class GenerarNumeroUnicoService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	GenerarNumeroUnicoDAO generarNumeroUnicoDAO;
		
	public GenerarNumeroUnicoResponse generarNumeroUnico(GenerarNumeroUnicoRequest generarNumeroUnicoRequest, 
			HttpServletResponse response) throws Exception{
		
		logger.info("Iniciando GeneraNumeroUnicoService - genrarNumeroUnico:  "+generarNumeroUnicoRequest);
		
		GenerarNumeroUnicoResponse generarNumeroUnicoResponse = new GenerarNumeroUnicoResponse();
		
		try {
			
			System.out.println("validacion:  "+"".equals(generarNumeroUnicoRequest.getCodigoComercio()));
			
			Operacion operacion = validarParametroEntrada(generarNumeroUnicoRequest.getCodigoComercio(), response);
			
			if(!"01".equals(operacion.getCodigoOperacion())) {
				System.out.println("codigo != 01");
				String numeroUnico = generarNumeroUnicoDAO.generaNumeroUnico(Long.parseLong(generarNumeroUnicoRequest.getCodigoComercio()));
				logger.info("numeroUnico:  "+numeroUnico);
				
				if(null == numeroUnico) {
					generarNumeroUnicoResponse.setCodigoOperacion(Constantes.COD_OPERACION_ERROR);
					generarNumeroUnicoResponse.setMensajeOperacion("El codigo de comercio no se encuentra registrado");
					response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
				}else {
					generarNumeroUnicoResponse.setNumeroUnico(Constantes.IDENTIFICADOR_NUMERO_UNICO+numeroUnico);
				}
				

			}else {
				generarNumeroUnicoResponse.setCodigoOperacion(operacion.getCodigoOperacion());
				generarNumeroUnicoResponse.setMensajeOperacion(operacion.getMensajeOperacion());				
			}
			
			
			
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		}
		
		return generarNumeroUnicoResponse;
	}
	
	public Operacion validarParametroEntrada(String parametro, HttpServletResponse response) {
		
		Operacion operacion = new Operacion();
		
		
		if(null == parametro || "".equals(parametro)) {
			
			System.out.println("parametro Null");
			
			operacion.setCodigoOperacion("01");
			operacion.setMensajeOperacion("El parámetro codigoComercio es obligatorio");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			
		}else if(!validaNumerico(parametro)) {
			System.out.println("No numerico");
			
			operacion.setCodigoOperacion("01");
			operacion.setMensajeOperacion("El codigoComercio debe ser numérico");
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		return operacion;
	}
	
	
	public boolean validaNumerico(String parametro) {
		
		boolean esNumerico = false;
		
		try {
			Long.parseLong(parametro);
			return true;
		}catch(NumberFormatException e) {
			return esNumerico;
		}
		
	}
	
	
}
