package com.tnsif.moneymoneybank.application;

import com.tnsif.moneymoneybank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNumber, String accHolderName, boolean isSaving) {
		super(accNumber, accHolderName, isSaving);

	}

	{
		System.out.println("Account Holder Name : " + getAccHolderName());
		System.out.println("Account Number : " + getAccNumber());
		System.out.println("*****************************");
	}

	

	@Override
	public String toString() {
		return "MMSavingAcc [isSaving=" + isSaving + ", getAccNumber()=" + getAccNumber() + ", getAccHolderName()="
				+ getAccHolderName() + ", getCashDeposit()=" + getCashDeposit() + ", getCashWithdraw()="
				+ getCashWithdraw() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
