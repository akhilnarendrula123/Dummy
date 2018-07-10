package com.cg.studentjoining.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class StudentDto implements Serializable {
	private int studentId;
	private String studentName;
	private String studentEmail;
	private long studentPhNo;
	private String gender;
	private LocalDate joiningDate;
	private int studentAge;
	private String studentcollege;
	private String studentCity;
	private String studentStatus = "Not Approved";

	public String getStudentStatus() {
		return studentStatus;
	}

	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public long getStudentPhNo() {
		return studentPhNo;
	}

	public void setStudentPhNo(long studentPhNo) {
		this.studentPhNo = studentPhNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentcollege() {
		return studentcollege;
	}

	public void setStudentcollege(String studentcollege) {
		this.studentcollege = studentcollege;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

}
