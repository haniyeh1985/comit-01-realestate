package com.comit.realestate.bean;

import java.util.Date;

public class RealestateBean {

	int idProperty;
	String type;
	double squareFeet;
	Date yearPropery;
	int bedroomNumbers;
	int bathrooNumbers;
	String balcone;
	String pool;
	String backyard;
	String garage;
	char statuse;
	RealestateBean(int idProperty, String type, double squareFeet, Date yearPropery, int bedroomNumbers,
			int bathrooNumbers, String balcone, String pool, String backyard, String garage, char statuse) {
		super();
		this.idProperty = idProperty;
		this.type = type;
		this.squareFeet = squareFeet;
		this.yearPropery = yearPropery;
		this.bedroomNumbers = bedroomNumbers;
		this.bathrooNumbers = bathrooNumbers;
		this.balcone = balcone;
		this.pool = pool;
		this.backyard = backyard;
		this.garage = garage;
		this.statuse = statuse;
	}
	int getIdProperty() {
		return idProperty;
	}
	void setIdProperty(int idProperty) {
		this.idProperty = idProperty;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	double getSquareFeet() {
		return squareFeet;
	}
	void setSquareFeet(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	Date getYearPropery() {
		return yearPropery;
	}
	void setYearPropery(Date yearPropery) {
		this.yearPropery = yearPropery;
	}
	int getBedroomNumbers() {
		return bedroomNumbers;
	}
	void setBedroomNumbers(int bedroomNumbers) {
		this.bedroomNumbers = bedroomNumbers;
	}
	int getBathrooNumbers() {
		return bathrooNumbers;
	}
	void setBathrooNumbers(int bathrooNumbers) {
		this.bathrooNumbers = bathrooNumbers;
	}
	String getBalcone() {
		return balcone;
	}
	void setBalcone(String balcone) {
		this.balcone = balcone;
	}
	String getPool() {
		return pool;
	}
	void setPool(String pool) {
		this.pool = pool;
	}
	String getBackyard() {
		return backyard;
	}
	void setBackyard(String backyard) {
		this.backyard = backyard;
	}
	String getGarage() {
		return garage;
	}
	void setGarage(String garage) {
		this.garage = garage;
	}
	char getStatuse() {
		return statuse;
	}
	void setStatuse(char statuse) {
		this.statuse = statuse;
	}
	@Override
	public String toString() {
		return "RealestateBean [idProperty=" + idProperty + ", type=" + type + ", squareFeet=" + squareFeet
				+ ", yearPropery=" + yearPropery + ", bedroomNumbers=" + bedroomNumbers + ", bathrooNumbers="
				+ bathrooNumbers + ", balcone=" + balcone + ", pool=" + pool + ", backyard=" + backyard + ", garage="
				+ garage + ", statuse=" + statuse + "]";
	}
	
}
