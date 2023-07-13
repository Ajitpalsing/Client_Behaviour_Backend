package com.example.client_behaviour.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private long id;
	private String savingsAccount;
	private String guarantees;
	private String currentAccount;
	private String derivativeAccount;
	private String payrollAccount;
	private String juniorAccount;
	private String massParticularAccount;
	private String particularAccount;
	private String particularPlusAccount;
	private String shortTermDeposits;
	private String medTermDeposits;
	private String longTermDeposits;
	private String eAccounts;
	private String funds;
	private String mortGage;
	private String pension1;
	private String loans;
	private String taxes;
	private String creditCard;
	private String securities;
	private String homeAccounts;
	private String payroll;
	private String pension2;
	private String directDebit;
	
	

}
