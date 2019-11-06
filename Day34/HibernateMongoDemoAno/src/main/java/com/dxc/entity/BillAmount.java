package com.dxc.entity;

public class BillAmount {

	private int billNumber;
	private int cgst;
	private int sgst;
	private int actualAmount;
	public BillAmount() {
		super();
	}
	public BillAmount(int billNumber, int cgst, int sgst, int actualAmount) {
		super();
		this.billNumber = billNumber;
		this.cgst = cgst;
		this.sgst = sgst;
		this.actualAmount = actualAmount;
	}
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public int getCgst() {
		return cgst;
	}
	public void setCgst(int cgst) {
		this.cgst = cgst;
	}
	public int getSgst() {
		return sgst;
	}
	public void setSgst(int sgst) {
		this.sgst = sgst;
	}
	public int getActualAmount() {
		return actualAmount;
	}
	public void setActualAmount(int actualAmount) {
		this.actualAmount = actualAmount;
	}
	@Override
	public String toString() {
		return "BillAmount [billNumber=" + billNumber + ", cgst=" + cgst + ", sgst=" + sgst + ", actualAmount="
				+ actualAmount + "]";
	}
	
}
