package com.example.tiffin01.models;

import java.io.Serializable;

public class Student implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private String name;

	private String emailId;

	private boolean isSelected;

	private boolean isSelected1;

	public Student() {

	}

	public Student(String name, String emailId) {

		this.name = name;
		this.emailId = emailId;

	}

	public Student(String name, String emailId, boolean isSelected, boolean isSelected1) {

		this.name = name;
		this.emailId = emailId;
		this.isSelected = isSelected;
		this.isSelected1 = isSelected1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public boolean isSelected1() {
		return isSelected1;
	}

	public void setSelected1(boolean isSelected1) {
		this.isSelected1 = isSelected1;
	}

}
