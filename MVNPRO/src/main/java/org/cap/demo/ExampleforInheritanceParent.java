package org.cap.demo;

public class ExampleforInheritanceParent {
	
	private String firstname;
	private String lastname;
	private String address;
	
	public ExampleforInheritanceParent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExampleforInheritanceParent(String firstname, String lastname, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
