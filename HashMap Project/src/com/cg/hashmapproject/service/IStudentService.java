package com.cg.hashmapproject.service;

import com.cg.hashmapproject.dto.StudentDto;
import com.cg.hashmapproject.exception.StudentException;

public interface IStudentService {

	public Integer  addStudent(StudentDto studentDto);
	public StudentDto showStudent(Integer id);
	public boolean validatedetails(StudentDto studentDTO) throws StudentException;
}
