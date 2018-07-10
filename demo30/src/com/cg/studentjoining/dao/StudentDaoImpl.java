package com.cg.studentjoining.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.studentjoining.dto.StudentDto;

public class StudentDaoImpl implements IStudentDao {
	private static HashMap<String, String> collegeMap = null;
	private static HashMap<Integer, StudentDto> studentMap = null;

	static {
		studentMap = new HashMap<>();
		collegeMap = new HashMap<>();
		collegeMap.put("Delhi", "IITD");
		collegeMap.put("Hyderabad", "IIITH");
		collegeMap.put("Chennai", "IITM");
		collegeMap.put("Banglore", "IITBLORE");
		collegeMap.put("Mumbai", "IITB");
	}
	@Override
	public int addStudentDetails(StudentDto studentDto) {
		studentMap.put(studentDto.getStudentId(), studentDto);
		return studentDto.getStudentId();
	}

	@Override
	public HashMap<Integer, StudentDto> getStudentDetails() {
		return studentMap;
	}

	public Map<String, String> getCollegeDetails() {
		return collegeMap;
	}

	

	

	
}
