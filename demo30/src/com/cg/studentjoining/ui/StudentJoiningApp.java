package com.cg.studentjoining.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.cg.studentjoining.Exception.MyException;
import com.cg.studentjoining.dto.StudentDto;
import com.cg.studentjoining.service.IStudentService;
import com.cg.studentjoining.service.StudentServiceImpl;

public class StudentJoiningApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		IStudentService iStudentService = new StudentServiceImpl();
		StudentDto student = new StudentDto();
		int choice;
		do {
			System.out.println("enter choice");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:// add
				try {
					System.out.println("enter name");
					String studentName = scanner.next();
					System.out.println("enter age");
					int studentAge = scanner.nextInt();
					System.out.println("enter phone no.");
					long studentPhNo = scanner.nextLong();
					System.out.println("enter emailid");
					String studentEmail = scanner.next();
					System.out.println("enter date");
					String joinDate = scanner.next();
					DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					LocalDate joiningDate = LocalDate.parse(joinDate, dateTimeFormatter);
					System.out.println("enter gender");
					String gender = scanner.next();
					System.out.println("enter city");
					String studentcity = scanner.next();

					if (iStudentService.validate(studentName, studentAge, studentPhNo, studentEmail, joinDate)) {

						student.setStudentName(studentName);
						student.setGender(gender);
						student.setStudentAge(studentAge);
						student.setStudentPhNo(studentPhNo);
						student.setJoiningDate(joiningDate);
						student.setStudentCity(studentcity);
						student.setStudentEmail(studentEmail);
						
						
				int generatedId1 = iStudentService.addStudentDetails(student);
			

						System.out.println(" your genetated ID  :" +generatedId1);
					}
				} catch (DateTimeParseException d) {
					System.out.println("invalid date");
				}

				catch (MyException e) {

					System.out.println(e.getMessage());
				}
				break;

			case 2:
				System.out.println("enter id");
				int studentId = 0;
				studentId = scanner.nextInt();
				StudentDto dto = iStudentService.viewStudentStatus(studentId);
				System.out.println(dto.getStudentcollege());
				System.out.println(dto.getStudentStatus());
				break;

			}

		} while (choice != 2);

	}
}
