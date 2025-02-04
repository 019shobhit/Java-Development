package com.image;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addressId;
	@Column(length = 50)
	private String dist;
	private String city;
	private boolean isOpen;
//	@Transient
	private double x;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] image;
	public Address(int addressId, String dist, String city, boolean isOpen, double x, Date date, byte[] image) {
		super();
		this.addressId = addressId;
		this.dist = dist;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
		this.image = image;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
