package com.tnsif.moneymoneybank.framework;

public abstract class CurrentAcc extends BankAcc {

	protected final float creaditLimit;

	public CurrentAcc(int accNumber, String accHolderName, float creaditLimit) {
		super(accNumber, accHolderName);
		this.creaditLimit = creaditLimit;
	}

	public void deposit(float cashDeposit) {
		accBalence = accBalence + cashDeposit;
		System.out.println("Deposit Amount is : " + cashDeposit + ".Rs");
		System.out.println("Cash Added to your account");
		System.out.println("Your account Balence is : " + accBalence + ".Rs");
		System.out.println("-----------------------------------------------");

	}

	public void withdraw(float cashWithdraw) {

		if (accBalence <= creaditLimit) {
			System.out.println("Insuficient Balence For Withdrawal");
		} else {
			accBalence = accBalence - cashWithdraw;
			System.out.println("Your Withdrawal Amount is : " + cashWithdraw + ".Rs");
			System.out.println("Your account Balence is : " + accBalence + ".Rs");
			System.out.println("-----------------------------------------------");
		}

	}

	@Override
	public String toString() {
		return "CurrentAcc [creaditLimit=" + creaditLimit + ", getAccNumber()=" + getAccNumber()
				+ ", getAccHolderName()=" + getAccHolderName() + ", getCashDeposit()=" + getCashDeposit()
				+ ", getCashWithdraw()=" + getCashWithdraw() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
