package com.cg.StudentProject.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.cg.StudentProject.exception.StudentProjectException;

public class StudentProject {
	private String name;
	private int id,passingYear;
	private LocalDate dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPassingYear() {
		return passingYear;
	}
	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) throws StudentProjectException{
			this.dob = dob;
		
	}
	
	
	

}
