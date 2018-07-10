package com.cg.studentjoining.service;

import com.cg.studentjoining.Exception.MyException;
import com.cg.studentjoining.dto.StudentDto;

public interface IStudentService {
	public int addStudentDetails(StudentDto student);
	public StudentDto viewStudentStatus(int studentId);
	public boolean validate(String name,int age,long PhNo, String email, String joindate) throws MyException;
}