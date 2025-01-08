package com.myPackage;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int addId;
	private String gaon;
	private String jilla;
	private boolean isOpen;
	@Transient
	private double x; 
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] img;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int addId, String gaon, String jilla, boolean isOpen, double x, Date date, byte[] img) {
		super();
		this.addId = addId;
		this.gaon = gaon;
		this.jilla = jilla;
		this.isOpen = isOpen;
		this.x = x;
		this.date = date;
		this.img = img;
	}
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getGaon() {
		return gaon;
	}
	public void setGaon(String gaon) {
		this.gaon = gaon;
	}
	public String getJilla() {
		return jilla;
	}
	public void setJilla(String jilla) {
		this.jilla = jilla;
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
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	
}
