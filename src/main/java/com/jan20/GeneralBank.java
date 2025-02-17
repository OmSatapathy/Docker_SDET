package com.jan20;

public class GeneralBank implements Banking,RBIBank {

	public static void main(String[] args) {
		
		Banking obj = new GeneralBank();
		obj.currentAccount();
		obj.savingAccount();

	}

	@Override
	public void accountCreate() {
		System.out.println("account created!");
		
	}

	@Override
	public void accountSummary() {
		System.out.println("summary created!");
		
	}

	@Override
	public void savingAccount() {
		
		System.out.println("savingAccount created!");
	}

	@Override
	public void currentAccount() {
		System.out.println("currentAccount created!");
		
	}

}
