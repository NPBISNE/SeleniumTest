package org.testing.Testcases;

public class BasicInformation 
{
	private String firstname;
	private String lastname;
	private String age;
	private String designation;
	private String id;
	private Addressinformation[] address;
	
	public Addressinformation[] getAddress() {
		return address;
	}
	public void setAddress(Addressinformation[] address) {
		this.address = address;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}