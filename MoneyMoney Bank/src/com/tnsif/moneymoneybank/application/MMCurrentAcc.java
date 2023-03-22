package com.tnsif.moneymoneybank.application;

import com.tnsif.moneymoneybank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNumber, String accHolderName, float creaditLimit) {
		super(accNumber, accHolderName, creaditLimit);

	}

	{
		System.out.println("Account Holder Name : " + getAccHolderName());
		System.out.println("Account Number : " + getAccNumber());
		System.out.println("Credit Limit : " + creaditLimit);
		System.out.println("*****************************");
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNumber()=" + getAccNumber()
				+ ", getAccHolderName()=" + getAccHolderName() + ", getCashDeposit()=" + getCashDeposit()
				+ ", getCashWithdraw()=" + getCashWithdraw() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
