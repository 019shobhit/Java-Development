package com.mapping1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@Column(name="Project_id")
	private int pId;
	@Column(name="Project_name")
	private String pName;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> employes;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<Emp> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Emp> employes) {
		this.employes = employes;
	}
	public Project(int pId, String pName, List<Emp> employes) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.employes = employes;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
