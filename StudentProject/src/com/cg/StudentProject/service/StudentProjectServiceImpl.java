package com.cg.StudentProject.service;

import java.util.Set;

import com.cg.StudentProject.dao.StudentProjectDaoImpl;
import com.cg.StudentProject.dto.StudentProject;

public class StudentProjectServiceImpl implements IStudentProjectService{

	StudentProjectDaoImpl dao=new StudentProjectDaoImpl();
	@Override
	public void addStudent(StudentProject studentProject) {
		// TODO Auto-generated method stub
		dao.addStudentDao(studentProject);
	}

	@Override
	public Set<StudentProject> showAllStudent() {
		// TODO Auto-generated method stub
		return dao.showAllStudentDao();
	}

	@Override
	public StudentProject searchStudent(int id) {
		// TODO Auto-generated method stub
		return dao.searchStudentDao(id);
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		dao.removeStudentDao(id);
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		boolean result=true;
		char[] chars = name.toCharArray();
	    for (char c : chars) {
	        if(!Character.isLetter(c)) {
	            return false;
	        }
	    }

		return result;
	}

}
