package com.tnsif.moneymoneybank.client;

import com.tnsif.moneymoneybank.application.MMBankFactory;
import com.tnsif.moneymoneybank.application.MMCurrentAcc;
import com.tnsif.moneymoneybank.application.MMSavingAcc;
import com.tnsif.moneymoneybank.framework.BankFactory;
import com.tnsif.moneymoneybank.framework.CurrentAcc;
import com.tnsif.moneymoneybank.framework.SavingAcc;

public class MoneyMoneyBank {
	public static void main(String[] args) {
		BankFactory factory = new MMBankFactory();

		CurrentAcc ac = new MMCurrentAcc(2222, "Sachin", 500);
		ac.deposit(1000);
		ac.withdraw(500);
		ac.withdraw(100);
		
		
		
		//SavingAcc sa=new MMSavingAcc(1234, "Swapnil", false);
		
		//sa.deposit(1500);
		//sa.withdraw(500);
		//sa.withdraw(500);
		//sa.withdraw(1);
		
		

	}

}
