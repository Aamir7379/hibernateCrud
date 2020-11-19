package com.jsoftteTechnology.DemoProject;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Student_Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int address_id;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Post_office")
	private String post_office;
	
	@Column(name="Street")
	private String street;

	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Lob
	private byte[]image;
	
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPost_office() {
		return post_office;
	}
	public void setPost_office(String post_office) {
		this.post_office = post_office;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	@Override
	public String toString() {
		return "Student_Address [address_id=" + address_id + ", city=" + city + ", post_office=" + post_office
				+ ", street=" + street + ", date=" + date + ", image=" + Arrays.toString(image) + "]";
	}

	
}
