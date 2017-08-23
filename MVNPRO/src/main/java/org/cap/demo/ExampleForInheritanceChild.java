package org.cap.demo;

public class ExampleForInheritanceChild extends ExampleforInheritanceParent{
	private int empId;
	private String empName;
	
	public ExampleForInheritanceChild(String fname, String lname,String address,int empId, String empName) {
		super(fname,lname,address);
		this.empId = empId;
		this.empName = empName;
	}
	
	public ExampleForInheritanceChild(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public ExampleForInheritanceChild() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExampleForInheritanceChild [empId=" + empId + ", empName=" + empName + ", toString()="
				+ super.toString() + "]";
	}
	

}
