package com.tnsif.moneymoneybank.framework;

public abstract class BankAcc {

	private int accNumber;
	private String accHolderName;
	protected static float accBalence;
	private float cashDeposit;
	private float cashWithdraw;

	public BankAcc(int accNumber, String accHolderName) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;

	}

	public BankAcc() {
		// TODO Auto-generated constructor stub
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public static float getAccBalence() {
		return accBalence;
	}

	public float getCashDeposit() {
		return cashDeposit;
	}

	public float getCashWithdraw() {
		return cashWithdraw;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public static void setAccBalence(float accBalence) {
		BankAcc.accBalence = accBalence;
	}

	public void setCashDeposit(float cashDeposit) {
		this.cashDeposit = cashDeposit;
	}

	public void setCashWithdraw(float cashWithdraw) {
		this.cashWithdraw = cashWithdraw;
	}

	public void withdraw(float cashWithdraw) {

	}

	public void deposit(float cashDeposit) {

	}

	@Override
	public String toString() {
		return "BankAcc [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", cashDeposit=" + cashDeposit
				+ ", cashWithdraw=" + cashWithdraw + ", getAccNumber()=" + getAccNumber() + ", getAccHolderName()="
				+ getAccHolderName() + ", getCashDeposit()=" + getCashDeposit() + ", getCashWithdraw()="
				+ getCashWithdraw() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
