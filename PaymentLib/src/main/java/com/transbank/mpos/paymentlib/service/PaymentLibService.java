package com.transbank.mpos.paymentlib.service;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.transbank.mpos.paymentlib.conf.Utilitarios;
import com.transbank.mpos.paymentlib.dto.Header;
import com.transbank.mpos.paymentlib.dto.PaymentLibRequest;
import com.transbank.mpos.paymentlib.dto.PaymentLibResponse;

@Service
public class PaymentLibService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public PaymentLibResponse parseJsonToSPDH(PaymentLibRequest paymentLibRequest) throws Exception{
		
		logger.info("Iniciando PaymentLibService - parseJsonToSPDH:  "+paymentLibRequest);
		
		PaymentLibResponse paymentLibResponse = new PaymentLibResponse();
		try {
			paymentLibResponse = validarParametrosEntrada(paymentLibRequest);
			if(!"01".equals(paymentLibResponse.getCodigoOperacion())){
				paymentLibResponse = construirSPDH(paymentLibRequest);				
			}
			
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e.getMessage());
		}
		
		return paymentLibResponse;
	}
	
	@Value( "${separadorCampos}" )
	private String separadorCampo;
	public PaymentLibResponse construirSPDH(PaymentLibRequest paymentLibRequest) throws Exception{
		
		logger.info("Iniciando PaymentLibService - construirSPDH:  "+paymentLibRequest);
		
		PaymentLibResponse paymentLibResponse = new PaymentLibResponse();
		
		try {
			
			String spdh = construirHeader(paymentLibRequest.getHeader());
			spdh += separadorCampo+construirCampoB(paymentLibRequest);
			spdh += separadorCampo+construirCampoS(paymentLibRequest);
			spdh += separadorCampo+construirCampoG(paymentLibRequest);
			spdh += separadorCampo+construirCampoP(paymentLibRequest);
			spdh += separadorCampo+construirCampoQ(paymentLibRequest);
			spdh += separadorCampo+construirCampoa(paymentLibRequest);
			spdh += separadorCampo+construirCampof();
			spdh += separadorCampo+construirCampob(paymentLibRequest);
			spdh += separadorCampo+construirCampod(paymentLibRequest);
			spdh += separadorCampo+construirCampoe(paymentLibRequest);
			spdh += separadorCampo+construirCampoh(paymentLibRequest);
			spdh += separadorCampo+construirCampot(paymentLibRequest);
			spdh += separadorCampo+construirCampo6(paymentLibRequest);
			spdh += separadorCampo+construirCampo9(paymentLibRequest);
			spdh += separadorCampo+construirCampoW(paymentLibRequest);
			spdh += construirFidsEncriptados(paymentLibRequest);
			
			paymentLibResponse.setSpdh(spdh);
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		}
		
		return paymentLibResponse;
		
	}
	
	@Value( "${deviceType}" )
	private String deviceType;
	@Value( "${employeeId}" )
	private String employeeId;
	@Value( "${processingFlag1}" )
	private String processingFlag1;
	@Value( "${processingFlag3}" )
	private String processingFlag3;
	@Value( "${responseCode}" )
	private String responseCode;
	public String construirHeader(Header header) {
		
		String response = new String();
		
		Utilitarios utilitarios = new Utilitarios();
		
		response += deviceType;
		response += header.getTransmissionNumber();
		response += header.getTerminalId();
		response += utilitarios.armarFiller(6, employeeId);
		response += header.getCurrentDate();
		response += header.getCurrentTime();
		response += header.getMessageTime();
		response += header.getMessageSubType();
		response += header.getTransactionCode();
		response += processingFlag1;
		response += header.getProcessingFlag2();
		response += processingFlag3;
		response += responseCode;
		
		return response;
		
	}
	
	@Value( "${inicioCampoB}" )
	private String inicioCampoB;
	public String construirCampoB(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoB;
		response += paymentLibRequest.getMonto();
		
		return response;
		
	}
	
	@Value( "${inicioCampoS}" )
	private String inicioCampoS;
	public String construirCampoS(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoS;
		response += paymentLibRequest.getNumeroBoleta();
		
		return response;
		
	}
	
	@Value( "${inicioCampoG}" )
	private String inicioCampoG;
	public String construirCampoG(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoG;
		response += paymentLibRequest.getMacEncriptado();
		
		return response;
		
	}
	
	@Value( "${inicioCampoP}" )
	private String inicioCampoP;
	public String construirCampoP(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoP;
		response += paymentLibRequest.getFlagCaptura();
		
		return response;
		
	}
	
	@Value( "${inicioCampoQ}" )
	private String inicioCampoQ;
	public String construirCampoQ(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoQ;
		response += paymentLibRequest.getDatosContexto();
		
		return response;
		
	}
	
	@Value( "${codigoMoneda}" )
	private String moneda;
	@Value( "${inicioCampoa}" )
	private String inicioCampoa;
	public String construirCampoa(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		Utilitarios utilitarios = new Utilitarios();
		
		response += inicioCampoa;
		response += utilitarios.armarFiller(3, "0");
		response += utilitarios.armarFiller(9, "0");
		response += utilitarios.armarFiller(14, "0");
		response += paymentLibRequest.getDatosTransbank().getNumeroUnico();
		response += utilitarios.armarFiller(17, "0");
		response += moneda;
		response += utilitarios.armarFiller(7, "0");
		
		return response;
		
	}
	
	@Value( "${largoPin}" )
	private String largoPin;
	@Value( "${inicioCampof}" )
	private String inicioCampof;
	public String construirCampof() {
		
		String response = new String();
		
		response += inicioCampof;
		response += largoPin;
		
		return response;
		
	}
	
	@Value( "${inicioCampob}" )
	private String inicioCampob;
	public String construirCampob(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampob;
		response += paymentLibRequest.getPinBlock();
		
		return response;
		
	}
	
	@Value( "${inicioCampod}" )
	private String inicioCampod;
	public String construirCampod(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampod;
		response += paymentLibRequest.getCodigoComercio();
		
		return response;
		
	}
	
	@Value( "${inicioCampoe}" )
	private String inicioCampoe;
	public String construirCampoe(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampod;
		response += paymentLibRequest.getTerminalConditionCode();
		
		return response;
		
	}
	
	@Value( "${numeroTurno}" )
	private String numeroTurno;
	@Value( "${flagDeReseteo}" )
	private String flagDeReseteo;
	@Value( "${inicioCampoh}" )
	private String inicioCampoh;
	public String construirCampoh(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampoh;
		response += numeroTurno;
		response += paymentLibRequest.getNumerosSecuencia().getNumeroBatch();
		response += paymentLibRequest.getNumerosSecuencia().getSecuencia();
		response += flagDeReseteo;
		
		return response;
		
	}
	
	@Value( "${fillerBlanco}" )
	private String fillerBlanco;
	@Value( "${inicioCampot}" )
	private String inicioCampot;
	public String construirCampot(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		Utilitarios utilitarios = new Utilitarios();
		
		response += inicioCampot;
		response += paymentLibRequest.getDatosTerminal().getModeloEquipo();
		response += utilitarios.armarFiller(3, fillerBlanco);
		response += paymentLibRequest.getDatosTerminal().getNumeroSerialTerminal();
		response += paymentLibRequest.getDatosTerminal().getNumeroSeriePinPad();
		response += utilitarios.armarFiller(2, fillerBlanco);
		response += paymentLibRequest.getDatosTerminal().getVersionPrograma()+fillerBlanco;
		response += utilitarios.armarFiller(10, fillerBlanco);
		response += utilitarios.armarFiller(14, fillerBlanco);
		response += utilitarios.armarFiller(6, fillerBlanco);
		
		return response;
		
	}
	
	@Value( "${separadorSubCampos}" )
	private String separadorSubCampos;
	@Value( "${inicioCampo6}" )
	private String inicioCampo6;
	public String construirCampo6(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampo6;
		response += separadorSubCampos+"E"+paymentLibRequest.getTipoVenta().getModoCapturaPAN();
		response += separadorSubCampos+"I"+paymentLibRequest.getTipoVenta().getMoneda();
		if(null != paymentLibRequest.getTipoVenta().getEnvChip()) {
			response += separadorSubCampos+"O"+paymentLibRequest.getTipoVenta().getEnvChip();			
		}
		if(null != paymentLibRequest.getTipoVenta().getEnvChipCless()) {
			response += separadorSubCampos+"P"+paymentLibRequest.getTipoVenta().getEnvChipCless();			
		}
		response += separadorSubCampos+"T"+paymentLibRequest.getTipoVenta().getKeySerialNumber();
		
		
		return response;
		
	}
	
	@Value( "${inicioCampo9}" )
	private String inicioCampo9;
	public String construirCampo9(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += inicioCampo9;
		response += separadorSubCampos+"A"+paymentLibRequest.getDatosPuntoVenta().getCodServicioPinCredito();
		response += separadorSubCampos+"B"+paymentLibRequest.getDatosPuntoVenta().getPinCredito();
		response += separadorSubCampos+"C"+paymentLibRequest.getDatosPuntoVenta().getDatosTransaccion();
		response += separadorSubCampos+"J"+paymentLibRequest.getDatosPuntoVenta().getPrepago();
		response += separadorSubCampos+"P"+paymentLibRequest.getDatosPuntoVenta().getPagoExpress();
		
		return response;
		
	}
	
	@Value( "${inicioCampoW}" )
	private String inicioCampoW;
	public String construirCampoW(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		Utilitarios utilitarios = new Utilitarios();
		
		response += inicioCampoW;
		response += paymentLibRequest.getCuota().getIndicadorLargo();
		response += paymentLibRequest.getCuota().getFlagPermiteCuota();
		response += paymentLibRequest.getCuota().getFlagGracia();
		response += paymentLibRequest.getCuota().getFlagC2c();
		response += paymentLibRequest.getCuota().getFlagC3c();
		response += paymentLibRequest.getCuota().getFlagNCuotas();
		response += paymentLibRequest.getCuota().getFlagMaximoCuotas();
		response += paymentLibRequest.getCuota().getTipoMenu();
		String tipoTarjeta = "";
		tipoTarjeta = paymentLibRequest.getCuota().getTipoTarjeta();
		if("".equals(tipoTarjeta) || tipoTarjeta == null) {
			tipoTarjeta = utilitarios.armarFiller(1, fillerBlanco);			
		}
		response += tipoTarjeta;
		String marcaTarjeta = "";
		marcaTarjeta = paymentLibRequest.getCuota().getMarcaTarjeta();
		if("".equals(marcaTarjeta) || marcaTarjeta == null) {
			marcaTarjeta = utilitarios.armarFiller(2, fillerBlanco);
		}
		response += marcaTarjeta;
		
		return response;
		
	}
	
	public String construirFidsEncriptados(PaymentLibRequest paymentLibRequest) {
		
		String response = new String();
		
		response += paymentLibRequest.getFidsEncriptado();
		
		return response;
		
	}
	
	public PaymentLibResponse validarParametrosEntrada(PaymentLibRequest paymentLibRequest) throws Exception{
		
		logger.info("Iniciando PaymentLibService - validarParametrosEntrada");
		
		PaymentLibResponse paymentLibResponse = new PaymentLibResponse();
		
		try {
			
			Utilitarios util = new Utilitarios();
			JSONObject json = new JSONObject(paymentLibRequest);
			
			String mensajeValidarParametros = util.validarJsonParametros(json);
			
			if(!"".equals(mensajeValidarParametros)) {
				logger.info("retornando error");
				paymentLibResponse.setCodigoOperacion("01");
				paymentLibResponse.setMensajeOperacion(mensajeValidarParametros);
			}
			
		}catch(Exception e) {
			logger.error(e.getMessage());
			throw new Exception(e);
		}
		
		return paymentLibResponse;
		
	}
	
	
	
}
