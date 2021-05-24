package com.postgres.springboot;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;


public class InputParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String paramString1;
	private String paramString2;

	public String getParamString1() {
		return paramString1;
	}

	public void setParamString1(String paramString1) {
		this.paramString1 = paramString1;
	}

	public String getParamString2() {
		return paramString2;
	}

	public void setParamString2(String paramString2) {
		this.paramString2 = paramString2;
	}
}
