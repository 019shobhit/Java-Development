package com.springcore.auto.wire;

public class Address {
	private String gaon;
	private String city;
	public String getGaon() {
		return gaon;
	}
	public void setGaon(String gaon) {
		this.gaon = gaon;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [gaon=" + gaon + ", city=" + city + "]";
	}
	
	
	

}
