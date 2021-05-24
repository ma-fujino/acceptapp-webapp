package com.postgres.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="t_accept_info")
public class TAcceptInfo {

	@Id
	@Column(length = 10)	
	@NotNull
	private String acceptInfoNo;
	
	@Column(length = 2)
	@NotNull
	private String status;
	
	@Column(length = 10)
	@NotNull
	private String customerNo;
	
	@Column(length = 10)	
	@NotNull
	private String serviceNo;
	
	@Column(length = 8)
	@NotNull
	private String acceptDate;
	
	@Column(length = 8, nullable = true)
	private String acceptCancelDate;
	
	@Column(length = 8, nullable = true)
	private String contractConfirmDate;
	
	@Column(length = 8, nullable = true)
	private String acceptLinkageDate;
	
	@Column(name = "option_no_1", length = 10, nullable = true)
	private String optionNo1;
	
	@Column(name = "option_no_2", length = 10, nullable = true)
	private String optionNo2;
	
	@Column(name = "option_no_3", length = 10, nullable = true)
	private String optionNo3;
	
	@Column(name = "option_no_4", length = 10, nullable = true)
	private String optionNo4;
	
	@Column(name = "option_no_5", length = 10, nullable = true)
	private String optionNo5;
	
	@Column(name = "campaign_no_1", length = 10, nullable = true)
	private String campaignNo1;
	
	@Column(name = "campaign_no_2", length = 10, nullable = true)
	private String campaignNo2;
	
	@Column(name = "campaign_no_3", length = 10, nullable = true)
	private String campaignNo3;
	
	@Column(name = "campaign_no_4", length = 10, nullable = true)
	private String campaignNo4;
	
	@Column(name = "campaign_no_5", length = 10, nullable = true)
	private String campaignNo5;

	
	public String getAcceptInfoNo() {
		return acceptInfoNo;
	}

	public void setAcceptInfoNo(String acceptInfoNo) {
		this.acceptInfoNo = acceptInfoNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getServiceNo() {
		return serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	public String getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(String acceptDate) {
		this.acceptDate = acceptDate;
	}

	public String getAcceptCancelDate() {
		return acceptCancelDate;
	}

	public void setAcceptCancelDate(String acceptCancelDate) {
		this.acceptCancelDate = acceptCancelDate;
	}

	public String getContractConfirmDate() {
		return contractConfirmDate;
	}

	public void setContractConfirmDate(String contractConfirmDate) {
		this.contractConfirmDate = contractConfirmDate;
	}

	public String getAcceptLinkageDate() {
		return acceptLinkageDate;
	}

	public void setAcceptLinkageDate(String acceptLinkageDate) {
		this.acceptLinkageDate = acceptLinkageDate;
	}

	public String getOptionNo1() {
		return optionNo1;
	}

	public void setOptionNo1(String optionNo1) {
		this.optionNo1 = optionNo1;
	}

	public String getOptionNo2() {
		return optionNo2;
	}

	public void setOptionNo2(String optionNo2) {
		this.optionNo2 = optionNo2;
	}

	public String getOptionNo3() {
		return optionNo3;
	}

	public void setOptionNo3(String optionNo3) {
		this.optionNo3 = optionNo3;
	}

	public String getOptionNo4() {
		return optionNo4;
	}

	public void setOptionNo4(String optionNo4) {
		this.optionNo4 = optionNo4;
	}

	public String getOptionNo5() {
		return optionNo5;
	}

	public void setOptionNo5(String optionNo5) {
		this.optionNo5 = optionNo5;
	}

	public String getCampaignNo1() {
		return campaignNo1;
	}

	public void setCampaignNo1(String campaignNo1) {
		this.campaignNo1 = campaignNo1;
	}

	public String getCampaignNo2() {
		return campaignNo2;
	}

	public void setCampaignNo2(String campaignNo2) {
		this.campaignNo2 = campaignNo2;
	}

	public String getCampaignNo3() {
		return campaignNo3;
	}

	public void setCampaignNo3(String campaignNo3) {
		this.campaignNo3 = campaignNo3;
	}

	public String getCampaignNo4() {
		return campaignNo4;
	}

	public void setCampaignNo4(String campaignNo4) {
		this.campaignNo4 = campaignNo4;
	}

	public String getCampaignNo5() {
		return campaignNo5;
	}

	public void setCampaignNo5(String campaignNo5) {
		this.campaignNo5 = campaignNo5;
	}

	
	
}
