package com.bankdetails;

import java.util.List;

import com.google.code.morphia.annotations.Embedded;
import com.google.code.morphia.annotations.Entity;

		
@Entity
public class Customer {
	
	private String customerName;
	private List<CustomerAccount> accounts;
	
	@Embedded
	private CustomerAddress address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the accounts
	 */
	public List<CustomerAccount> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(List<CustomerAccount> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the address
	 */
	public CustomerAddress getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", accounts=" + accounts + ", address=" + address + "]";
	}
	
	

}
