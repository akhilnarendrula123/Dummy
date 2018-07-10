package com.cg.hashmapproject.service.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.hashmapproject.dao.IStudentDao;
import com.cg.hashmapproject.dao.StudentDaoImpl;
import com.cg.hashmapproject.dto.StudentDto;

public class StudentJunitTest {

	IStudentDao dao = new StudentDaoImpl();

	@BeforeClass
	public static void setUp() throws Exception {
		System.out.println("Testing Starts");
	}

	@AfterClass
	public static void endUp() throws Exception {
		System.out.println("Testing Ends");
	}

	@Test
	public void getCollegeValidTest() {
		assertEquals("IIT Chennai", dao.getCollege("Chennai"));
	}

	@Test
	public void getCollegeNullTest() {
		assertNull(dao.getCollege(" "));
	}

	@Test
	public void addStudentTest() {
		StudentDto studentDTO = new StudentDto();
		studentDTO.setAge(21);
		studentDTO.setCity("Chennai");
		studentDTO.setEmail("v@gmail.com");
		studentDTO.setGender('M');
		studentDTO.setName("Vikash");
		studentDTO.setNumber("1236547896");
		dao.addStudent(studentDTO);
		assertEquals("IIT Chennai", dao.getCollege(studentDTO.getCity()));

	}

	@Test
	public void getCollegeInvalidInputsTest() {
		assertNotSame("Kolkata", dao.getCollege("kolkata"));
	}

	@Test
	public void showStudent() {
		assertNull(null, dao.showStudent(1234));
	}

}
