package com.cg.StudentProject.service;

import java.util.Set;

import com.cg.StudentProject.dto.StudentProject;

public interface IStudentProjectService {

	public void addStudent(StudentProject studentProject);
	public Set<StudentProject>showAllStudent();
	public StudentProject searchStudent(int id);
	public void removeStudent(int id);
	public boolean validateName(String name);
}
