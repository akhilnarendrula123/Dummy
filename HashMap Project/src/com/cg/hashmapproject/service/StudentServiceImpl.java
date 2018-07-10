package com.cg.hashmapproject.service;

import com.cg.hashmapproject.dao.IStudentDao;
import com.cg.hashmapproject.dao.StudentDaoImpl;
import com.cg.hashmapproject.dto.StudentDto;
import com.cg.hashmapproject.exception.IStudentExceptionMessages;
import com.cg.hashmapproject.exception.StudentException;

public class StudentServiceImpl implements IStudentService {

	IStudentDao dao = null;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public Integer addStudent(StudentDto studentDto) {
		Integer generatedId = (int) (Math.random() * (9000 + 1000));
		String college = dao.getCollege(studentDto.getCity());
		if (college != null) {
			studentDto.setStatus("Approved");
			studentDto.setId(generatedId);
			studentDto.setCollege(college);
			dao.addStudent(studentDto);
		}
		return generatedId;

	}

	@Override
	public StudentDto showStudent(Integer id) {
		return dao.showStudent(id);
	}

	@Override
	public boolean validatedetails(StudentDto studentDTO) throws StudentException {
		boolean result = true;
		if (!(studentDTO.getName().matches("^[a-zA-Z]*$"))) {
			throw new StudentException(IStudentExceptionMessages.MESSAGE1);
		}
		if (!(studentDTO.getNumber().matches("^[0-9]+$") && studentDTO.getNumber().length() == 10)) {
			throw new StudentException(IStudentExceptionMessages.MESSAGE2);

		}
		if (!(studentDTO.getAge() > 1 && studentDTO.getAge() < 100)) {
			throw new StudentException(IStudentExceptionMessages.MESSAGE3);

		}
			if (!(studentDTO.getEmail().matches("^[a-z]{1}[a-z0-9-]{1,}@[a-z0-9-.]{1,}[a-z]{2,}$"))) {
			throw new StudentException(IStudentExceptionMessages.MESSAGE4);
		}
		return result;
	}

}
