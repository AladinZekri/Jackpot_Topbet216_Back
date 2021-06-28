package com.bezkoder.springjwt.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(	name = "winners")
public class Winner {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	private String name ;
	private String amout ;
	private String winDate;
	
	
	
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



	public String getAmout() {
		return amout;
	}



	public void setAmout(String amout) {
		this.amout = amout;
	}



	public String getWinDate() {
		return winDate;
	}



	public void setWinDate(String winDate) {
		this.winDate = winDate;
	}



	public Winner() {
		super();
	}



	public Winner(String name, String amout, String winDate) {
		super();
		this.name = name;
		this.amout = amout;
		this.winDate = winDate;
	}



	public Winner(long id, String name, String amout, String winDate) {
		super();
		this.id = id;
		this.name = name;
		this.amout = amout;
		this.winDate = winDate;
	}
	
	
	
	
	
	
}