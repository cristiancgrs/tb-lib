package com.transbank.lib.testqueue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

	@Value("${spdh}")
	private String spdh;
	@Value("${saldo}")
	private String saldo;
	
	public String getSpdh() {
		return spdh;
	}
	public void setSpdh(String spdh) {
		this.spdh = spdh;
	}
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Properties [spdh=" + spdh + ", saldo=" + saldo + "]";
	}
	
}
