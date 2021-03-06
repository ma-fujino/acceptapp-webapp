package com.postgres.springboot;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@XmlRootElement
@Entity
@Table(name="mydata")
public class MyData {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mydata_id_seq")
    @SequenceGenerator(name = "mydata_id_seq", sequenceName = "mydata_id_seq", allocationSize = 1)
	@Column
	@NotNull
	private long id;
	
	@Column(length = 50, nullable = false)
	@NotEmpty
	private String name;
	
	@Column(length = 200, nullable = true)
	@Email
	private String mail;
	
	@Column(nullable = true)
	private String age;
	
	@Column(nullable = true)
	@Phone(onlyNumber=true)
	private String memo;
	
	@OneToMany(cascade=CascadeType.ALL)
	@Column(nullable = true)
	private List<MsgData> msgdatas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

//	public List<MsgData> getMsgdatas() {
//		return msgdatas;
//	}
//
//	public void setMsgdatas(List<MsgData> msgdatas) {
//		this.msgdatas = msgdatas;
//	}
	
}
