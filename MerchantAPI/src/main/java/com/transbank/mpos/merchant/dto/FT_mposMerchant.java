package com.transbank.mpos.merchant.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="ST_GENERA_NUMERO_UNICO",
							   procedureName="PKG_TBK_MERCHANT.ST_GENERA_NUMERO_UNICO",
							   parameters= {
									   @StoredProcedureParameter(mode=ParameterMode.IN, name="CDG_codComercio", type=Long.class),
									   @StoredProcedureParameter(mode=ParameterMode.OUT, name="CDG_numeroUnicoTransaccion", type=String.class)
							   },
							   resultClasses=FT_mposMerchant.class)
})
@Entity
public class FT_mposMerchant implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	public Long codComercio;
	
}
