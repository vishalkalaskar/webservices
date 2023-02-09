package com.example.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
 //mandotry things are Entity and ID
@Entity
@Table(name="DATA_JPA_ACTOR")

public class Actor 
{
	@Column(name="ACTOR_ID")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;
	
	@Column(name="ACTOR_NAME")
	private String aname;
	
	@Column(name="CATEGORY")
	private String category;
	
	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column(name="MOBILENO")
	private Long mobileNo;

}
