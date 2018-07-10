package com.cg.StudentProject.dao;
import java.util.Set;

import com.cg.StudentProject.dto.StudentProject;

public interface IStudentProjectDao {

	public void addStudentDao(StudentProject studentProject);
	public Set<StudentProject>showAllStudentDao();
	public StudentProject searchStudentDao(int id);
	public void removeStudentDao(int id);
}
