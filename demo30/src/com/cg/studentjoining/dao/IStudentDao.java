package com.cg.studentjoining.dao;

import java.util.Map;

import com.cg.studentjoining.dto.StudentDto;

public interface IStudentDao {
	public int addStudentDetails(StudentDto student);

	public Map<Integer, StudentDto> getStudentDetails() ;

	public Map<String, String> getCollegeDetails();

	
}
