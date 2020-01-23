/**
 * 
 */
package com.nisum.demo.domain;

/**
 * @author
 *
 */
public class Employee {

	private Integer id;
	private String fname;
	private String lname;

	public Employee() {
	}

	public Employee(Integer id, String fname, String lname) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

}
