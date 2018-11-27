package com.transbank.mpos.paymentlib.dto;

public class Header {

	private String transmissionNumber;
	private String terminalId;
	private String currentDate;
	private String currentTime;
	private String messageTime;
	private String messageSubType;
	private String transactionCode;
	private String processingFlag2;
	
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
	public String getMessageTime() {
		return messageTime;
	}
	public void setMessageTime(String messageTime) {
		this.messageTime = messageTime;
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
	public String getProcessingFlag2() {
		return processingFlag2;
	}
	public void setProcessingFlag2(String processingFlag2) {
		this.processingFlag2 = processingFlag2;
	}
	
	@Override
	public String toString() {
		return "Header [transmissionNumber=" + transmissionNumber + ", terminalId=" + terminalId + ", currentDate="
				+ currentDate + ", currentTime=" + currentTime + ", messageTime=" + messageTime + ", messageSubType="
				+ messageSubType + ", transactionCode=" + transactionCode + ", processingFlag2=" + processingFlag2
				+ "]";
	}
	
}
