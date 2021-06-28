package com.bezkoder.springjwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(	name = "jackpot")
public class Jackpot {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	private String EndDate ;
	private String StartDate ;
	
	
	public Jackpot(long id, String endDate, String startDate) {
		super();
		this.id = id;
		EndDate = endDate;
		StartDate = startDate;
	}
	public Jackpot(String endDate, String startDate) {
		super();
		EndDate = endDate;
		StartDate = startDate;
	}
	public Jackpot() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate(String startDate) {
		StartDate = startDate;
	}
	
	
	
	

}
