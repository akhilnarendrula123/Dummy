package com.cg.StudentProject.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.cg.StudentProject.dto.StudentProject;
import com.cg.StudentProject.exception.StudentProjectException;
import com.cg.StudentProject.service.IStudentProjectService;
import com.cg.StudentProject.service.StudentProjectServiceImpl;
public class StudentProjectMain {

	static Scanner scanner=new Scanner(System.in);
	static IStudentProjectService service=new StudentProjectServiceImpl();
	public static void main(String[] args) throws StudentProjectException{
		// TODO Auto-generated method stub
		int choice=0;
		
		do {
			printDetails();
			System.out.println("Enter Choice");
			choice=scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Student Name");
				String name=scanner.next();
			    boolean result=service.validateName(name);
			    if (result) {
			    	int id = (int )(Math.random() * 9000 + 1000);
					LocalDate dob=null;
				    try {
				    	System.out.println("Enter DOB in MMM-dd-yyyy format");
					    String input1=scanner.next();
				    	 DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
				    	 dob=LocalDate.parse(input1, dateTimeFormatter);
				    	  System.out.println("Enter Passing Year");
							int passingYear=scanner.nextInt();
							StudentProject studentProject=new StudentProject();
							studentProject.setDob(dob);
							studentProject.setId(id);
							studentProject.setName(name);
							studentProject.setPassingYear(passingYear);
							service.addStudent(studentProject);
					} catch (Exception e) {
						try {
							throw new StudentProjectException("Wrong format...please type in correct format");
						} catch (StudentProjectException e2) {
							// TODO: handle exception
							System.out.println(e2.getMessage());
						}
						
					}
				   }
				    
				else {
					System.out.println("Name Should Only Contain Alphabetic Character");
				}
				break;
			case 2:
				System.out.println("Enter Student ID: ");
				int eid=scanner.nextInt();
				StudentProject student=service.searchStudent(eid);
				if (student!=null) {
					System.out.println("\nStudent Id:"+student.getId());
					System.out.println("Student Name:"+student.getName());
					 DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
					System.out.println("Student DOB:"+student.getDob().format(dateTimeFormatter));
					System.out.println("Student PassingYear:"+student.getPassingYear()+"\n");
						
				}else {
					System.out.println("No Student Found");
				}
				break;
			case 3:
				Set<StudentProject> alldata=service.showAllStudent();
				for (StudentProject all : alldata) {
					System.out.println("\nStudent Id:"+all.getId());
					System.out.println("Student Name:"+all.getName());
					 DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
						System.out.println("Student DOB:"+all.getDob().format(dateTimeFormatter));
					System.out.println("Student PassingYear:"+all.getPassingYear()+"\n");	
				}
				break;
			case 4:
				System.out.println("Enter Student ID: ");
				int eidd=scanner.nextInt();
				service.removeStudent(eidd);
			break;
			case 5:
					System.out.println("Thanks for Using..............");
					System.exit(0);
				break;
			default:
				break;
			}
		} while (choice!=5);
		
		
	}
	public static void printDetails() {
		System.out.println("\nMENU");
		System.out.println("===========");
		System.out.println("\n1. Add Student\n2. Search Student\n3. View All Student\n4. Delete Student\n5. Exit");
	}
}
