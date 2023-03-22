package com.tnsif.moneymoneybank.framework;

public abstract class BankFactory {

	public abstract SavingAcc getNewSavingAcc(int accNumber, String accHolderName, boolean isSaving);

	public abstract CurrentAcc getNewCurrentAcc(int accNumber, String accHolderName, float creaditLimit);

}
