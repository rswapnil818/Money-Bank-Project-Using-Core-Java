package com.tnsif.moneymoneybank.application;

import com.tnsif.moneymoneybank.framework.BankFactory;
import com.tnsif.moneymoneybank.framework.CurrentAcc;
import com.tnsif.moneymoneybank.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accNumber, String accHolderName, boolean isSaving) {
		MMSavingAcc sa = new MMSavingAcc(accNumber, accHolderName, isSaving);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNumber, String accHolderName, float creaditLimit) {
		MMCurrentAcc ca = new MMCurrentAcc(accNumber, accHolderName, creaditLimit);
		return ca;
	}

}
