package com.springboot.locations_deployment.Location;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Location {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public Location() {
		super();
	}
	@Column
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Location(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + "]";
	}
	   
}
