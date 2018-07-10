package com.cg.hashmapproject.dao;

import com.cg.hashmapproject.dto.StudentDto;

public interface IStudentDao {

	public String getCollege(String city);
	public void addStudent(StudentDto studentDto);
	public StudentDto showStudent(Integer id);
}
