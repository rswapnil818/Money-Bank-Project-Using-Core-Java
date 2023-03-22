package com.tnsif.moneymoneybank.framework;

public abstract class SavingAcc extends BankAcc {

	protected boolean isSaving = true;
	public static final float minBalance = 500;

	public SavingAcc(int accNumber, String accHolderName, float cashDeposit, float cashWithdraw) {
		super(accNumber, accHolderName);
		// TODO Auto-generated constructor stub
	}

	public SavingAcc(int accNumber, String accHolderName, boolean isSaving) {
		super(accNumber, accHolderName);
		this.isSaving = isSaving;
	}
	


	public void deposit(float cashDeposit) {

		accBalence = accBalence + cashDeposit;
		System.out.println("Deposit Amount is : " + cashDeposit + ".Rs");
		System.out.println("Cash Added to your account");
		System.out.println("Your account Balence is : " + accBalence + ".Rs");
		System.out.println("-----------------------------------------------");

	}

	public void withdraw(float cashWithdraw) {
		
			if (isSaving) {
				accBalence = accBalence - cashWithdraw;

				if (accBalence <minBalance ) {

					System.out.println("You are not able to withdraw below  " + minBalance + ".Rs");
				} else {
					System.out.println("Your Withdrawal Amount is : " + cashWithdraw + ".Rs");
					System.out.println("Your account Balence is : " + accBalence + ".Rs");
					System.out.println("-----------------------------------------------");
				}

			} else {
				System.out.println("Dear account Holder>>> Your Account is not saving account>>Select isSaving=true");
			}

		}

	
	


	@Override
	public String toString() {
		return "SavingAcc [isSaving=" + isSaving + ", getAccNumber()=" + getAccNumber() + ", getAccHolderName()="
				+ getAccHolderName() + ", getCashDeposit()=" + getCashDeposit() + ", getCashWithdraw()="
				+ getCashWithdraw() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
