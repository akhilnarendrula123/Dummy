package com.cg.studentjoining.test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.studentjoining.dao.IStudentDao;
import com.cg.studentjoining.dao.StudentDaoImpl;
import com.cg.studentjoining.dto.StudentDto;

public class StudentDaoTest {
	private static IStudentDao dao = null;

	@BeforeClass
	public static void  setUp() {
		dao=new StudentDaoImpl();
	}
	// StudentDto dto= new StudentDto();
	@Test
	public void collegeTest() {
		assertEquals("IIITH", dao.getCollegeDetails().get("Hyderabad"));
	}

	@Test
	public void collegeNullTest() {
		assertNull(dao.getCollegeDetails().get(0));
	}

	@Test
	public void collegeTest1() {
		assertEquals("IITD", dao.getCollegeDetails().get("Delhi"));
	}

	@Test
	public void collegeInvalid() {
		assertNotSame("Delhi", dao.getCollegeDetails().get("Delhi"));
	}

	@Test
	public void addTest() {
		StudentDto dto = new StudentDto();
		dto.setStudentName("sneha");
		dto.setStudentCity("Mumbai");
		dto.setGender("female");
		dto.setStudentAge(21);
		dao.addStudentDetails(dto);
		assertEquals("IITB", dao.getCollegeDetails().get(dto.getStudentCity()));
	}
}