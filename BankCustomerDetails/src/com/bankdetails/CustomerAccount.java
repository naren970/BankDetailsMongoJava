package com.bankdetails;

import com.google.code.morphia.annotations.Entity;

@Entity
public class CustomerAccount{
	
	private String accountType;
	private String accountLimit;
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the accountLimit
	 */
	public String getAccountLimit() {
		return accountLimit;
	}
	/**
	 * @param accountLimit the accountLimit to set
	 */
	public void setAccountLimit(String accountLimit) {
		this.accountLimit = accountLimit;
	}
}
