package com.cg.studentjoining.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.cg.studentjoining.Exception.IMyExceptionMessages;
import com.cg.studentjoining.Exception.MyException;
import com.cg.studentjoining.dao.IStudentDao;
import com.cg.studentjoining.dao.StudentDaoImpl;
import com.cg.studentjoining.dto.StudentDto;

public class StudentServiceImpl implements IStudentService {
	IStudentDao iStudentDao = null;

	public StudentServiceImpl() {
		iStudentDao = new StudentDaoImpl();
	}

	@Override
	public int addStudentDetails(StudentDto student) {
		Map<String, String> collegeDetails = iStudentDao.getCollegeDetails();
		if (collegeDetails.containsKey(student.getStudentCity())) {
			int generatedId = (int) (Math.random() * 10000);
			student.setStudentId(generatedId);
			student.setStudentStatus("Approved");
			student.setStudentcollege(collegeDetails.get(student.getStudentCity()));

		}
		return iStudentDao.addStudentDetails(student);

	}

	public boolean validate(String name, int age, long PhNo, String email, String joindate) throws MyException {
		boolean result = false;
		if (name.trim().matches("[a-z][A-z]*")) {
			if (age > 0 && age < 100) {
				try {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					LocalDate.parse(joindate, formatter);
					//
					if (((PhNo + "").matches("\\d{10}"))) {
						if (email.endsWith(".com")) {
							result = true;
						} else {
							throw new MyException(IMyExceptionMessages.ERROR5);
						}

					} else {
						throw new MyException(IMyExceptionMessages.ERROR4);
					}
				} catch (DateTimeParseException e) {
					throw new MyException(IMyExceptionMessages.ERROR1);
				}

			} else {
				throw new MyException(IMyExceptionMessages.ERROR2);

			}

		} else {
			throw new MyException(IMyExceptionMessages.ERROR3);
		}
		return result;
	}

	@Override
	public StudentDto viewStudentStatus(int studentId) {
		// TODO Auto-generated method stub
		return iStudentDao.getStudentDetails().get(studentId);
	}
}