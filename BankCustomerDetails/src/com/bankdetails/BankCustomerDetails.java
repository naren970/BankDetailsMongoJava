package com.bankdetails;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Key;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

public class BankCustomerDetails {

	public static void main(String[] args) throws UnknownHostException {
		
		
		//Creating Account types
		
		//Account type 1
		CustomerAccount  account = new CustomerAccount();
		account.setAccountType("Savings Accounts");
		account.setAccountType("Loan Account");
		//Account type 2
		CustomerAccount  account1 = new CustomerAccount();
		account1.setAccountLimit("20000");
		account1.setAccountLimit("50000");
		
		//Making list of accounts
		ArrayList<CustomerAccount> accounts = new ArrayList<CustomerAccount>();
		accounts.add(account);
		accounts.add(account1);
		
		//Address
		CustomerAddress address = new CustomerAddress();
		address.setNumber("12345678");
		address.setStreet("T Nagar");
		address.setTown("Chennai");
		
		
		//Adding Customer details to Customer class
		Customer customer = new Customer();
		customer.setCustomerName("Narendrtretdra");
		customer.setAccounts(accounts);
		customer.setAddress(address);
		
		
		//Establishing the DB Connection
		String db = new String("bank");
		Mongo mongo = new Mongo("127.0.0.1");
		Morphia morphia = new Morphia();
		Datastore dataStore = morphia.createDatastore(mongo, db);
		
		//Save the data into database 
		Key<Customer> savedCustomer = dataStore.save(customer);
		System.out.println(dataStore.getCollection(BankCustomerDetails.class));
	}
}
