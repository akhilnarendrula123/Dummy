package com.cg.StudentProject.dao;

import java.util.HashSet;
import java.util.Set;

import com.cg.StudentProject.dto.StudentProject;

public class StudentProjectDaoImpl implements IStudentProjectDao{

	static Set<StudentProject> mySet=null;
	static {
		mySet=new HashSet<>();
	}
	@Override
	public void addStudentDao(StudentProject studentProject) {
		// TODO Auto-generated method stub
		mySet.add(studentProject);
		System.out.println("Student Added Successfully with ID is: "+studentProject.getId());
	}

	@Override
	public Set<StudentProject> showAllStudentDao() {
		// TODO Auto-generated method stub
		return mySet;
	}

	@Override
	public StudentProject searchStudentDao(int id) {
		// TODO Auto-generated method stub
		StudentProject search = null;
		for (StudentProject studentProject : mySet) {
			if (studentProject.getId() == id) {
				search = studentProject;
				break;
			}

		}
		return search;
	}

	@Override
	public void removeStudentDao(int id) {
		// TODO Auto-generated method stub
		int found=0;
		for (StudentProject studentProject : mySet) {
			if (studentProject.getId() == id) {
				mySet.remove(studentProject);
				System.out.println("Student Removed");
				found=1;
				break;
			}

		}
		if (found==0) {
			System.out.println("No Student Found");
		}
	}

}
