package com.postgres.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="m_customer")
public class MCustomer {

	@Id
	@Column(length = 10)	
	@NotNull
	private String customerNo;
	
	@Column(length = 50)
	@NotNull
	private String customerSei;
	
	@Column(length = 50)
	@NotNull
	private String customerMei;
	
	@Column(length = 8)
	@NotNull
	private String customerBirthday;
	
	@Column(length = 7)
	@NotNull
	private String postNo;
	
	@Column(name="address_1", length = 4)
	@NotNull
	private String address1;
	
	@Column(name="address_2", length = 20)
	@NotNull
	private String address2;
	
	@Column(name="address_3", length = 20)
	@NotNull
	private String address3;
	
	@Column(name="address_4", length = 4, nullable=true)
	private String address4;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@Column(nullable = true)
//	private List<TAcceptInfo> msgdatas;

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerSei() {
		return customerSei;
	}

	public void setCustomerSei(String customerSei) {
		this.customerSei = customerSei;
	}

	public String getCustomerMei() {
		return customerMei;
	}

	public void setCustomerMei(String customerMei) {
		this.customerMei = customerMei;
	}

	public String getCustomerBirthday() {
		return customerBirthday;
	}

	public void setCustomerBirthday(String customerBirthday) {
		this.customerBirthday = customerBirthday;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}


	
}
