package com.neuedu.bean;

public class Items {

	
	private String name;
	
	private double price;
	
	private String descibe;
	
	private String cdate;

	public Items(){
		
	}
	
	public Items(String name,double price,String descibe,String cdate){
		this.name = name;
		this.price = price;
		this.descibe = descibe;
		this.cdate = cdate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescibe() {
		return descibe;
	}

	public void setDescibe(String descibe) {
		this.descibe = descibe;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	
	
	
	
	
}
