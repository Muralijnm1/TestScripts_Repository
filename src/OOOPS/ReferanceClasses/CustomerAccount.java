package OOOPS.ReferanceClasses;

public class CustomerAccount {
	private double balance =0.0;
	
	
		
	
	public double getBalance(int accountNumber,String passWord){
		int existingAccountNumber =123456;
		String expectedPassword="Password@1234";
		if((accountNumber==existingAccountNumber) && (passWord.equals(expectedPassword))){
			return balance;
		}
		else
		return -1;
	}
	}
