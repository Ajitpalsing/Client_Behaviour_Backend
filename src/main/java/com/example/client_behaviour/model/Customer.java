package com.example.client_behaviour.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

@Id
@GeneratedValue
private long customerId;
private String statusDate;
private String status;
private String country;
private int age;
private String sex;
private String joiningDate;
private boolean isNewCustomer;
private String customerSince;
private String relationshipStatus;
private String lastDatePrimaryCustomer;
private String customerTypeMthBeg;
private String customerRelationshipTypeMthBeg;
private String residentCity;
private boolean isForeigner;
private boolean isSpouseEmployee;
private String joinChannel;
private String deceasedFlag;
private String addressType;
private String customerProvinceCd;
private String customerProviceName;
private String customerActiveStatus;
private double grossHhldIncome;
private String customerSegment;

private String name;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name = "cust_id", referencedColumnName = "customerId")
private List<Product> products;

}
