package com.transbank.lib.dto;

public class Header {

	private String deviceType;
	private String transmissionNumber;
	private String terminalId;
	private String employeeId;
	private String currentDate;
	private String currentTime;
	private String messageType;
	private String messageSubType;
	private String transactionCode;
	private String flag1;
	private String flag2;
	private String flag3;
	private String responseCode;
	
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getTransmissionNumber() {
		return transmissionNumber;
	}
	public void setTransmissionNumber(String transmissionNumber) {
		this.transmissionNumber = transmissionNumber;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessageSubType() {
		return messageSubType;
	}
	public void setMessageSubType(String messageSubType) {
		this.messageSubType = messageSubType;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getFlag1() {
		return flag1;
	}
	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}
	public String getFlag2() {
		return flag2;
	}
	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}
	public String getFlag3() {
		return flag3;
	}
	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	
	@Override
	public String toString() {
		return "Header [deviceType=" + deviceType + ", transmissionNumber=" + transmissionNumber + ", terminalId="
				+ terminalId + ", employeeId=" + employeeId + ", currentDate=" + currentDate + ", currentTime="
				+ currentTime + ", messageType=" + messageType + ", messageSubType=" + messageSubType
				+ ", transactionCode=" + transactionCode + ", flag1=" + flag1 + ", flag2=" + flag2 + ", flag3=" + flag3
				+ ", responseCode=" + responseCode + "]";
	}
	
}
