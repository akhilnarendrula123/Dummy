package com.cg.hashmapproject.dao;

import java.util.HashMap;

import com.cg.hashmapproject.dto.StudentDto;

public class StudentDaoImpl implements IStudentDao {

	private static HashMap<String, String> myCollegeList = null;
	private static HashMap<Integer, StudentDto> myStudentList = null;
	static {
		myCollegeList= new HashMap<>();
		myStudentList= new HashMap<>();;
		myCollegeList.put("Delhi", "IIT Delhi");
		myCollegeList.put("Patna", "IIT Patna");
		myCollegeList.put("Chennai", "IIT Chennai");
		myCollegeList.put("Hyderabad", "IIT Hyderabad");
		myCollegeList.put("Mumbai", "IIT Mumbai");

	}

	@Override
	public String getCollege(String city) {
		return myCollegeList.get(city);
	}

	@Override
	public void addStudent(StudentDto studentDto) {
		myStudentList.put(studentDto.getId(), studentDto);

	}

	@Override
	public StudentDto showStudent(Integer id) {
		return myStudentList.get(id);
	}

}
