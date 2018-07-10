package com.cg.hashmapproject.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import com.cg.hashmapproject.dto.StudentDto;
import com.cg.hashmapproject.exception.IStudentExceptionMessages;
import com.cg.hashmapproject.exception.StudentException;
import com.cg.hashmapproject.service.IStudentService;
import com.cg.hashmapproject.service.StudentServiceImpl;

public class StudentMain {
	
	public static void main(String[] args) {
		 IStudentService 	service = new StudentServiceImpl();
		 Scanner scanner=new Scanner(System.in);
		int choice=0;
		do {
			menu();
			System.out.println("===================\nEnter Your Choice");
			choice = new Scanner(System.in).nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Name");
				String name = scanner.next();
				System.out.println("Enter Phone Number");
				String number = scanner.next();
				System.out.println("Enter Email");
				String email = scanner.next();
				System.out.println("Enter Age");
				int age = scanner.nextInt();
				System.out.println("Enter Gender");
				String gender = scanner.next();
				System.out.println("Enter City Where You Want to Study");
				String city = scanner.next();
				System.out.println("Enter Date of joining in dd-MMM-yyyy format");
				String input1 = scanner.next();
				LocalDate date = null;
				try {
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
					date = LocalDate.parse(input1, formatter);
				} catch (DateTimeParseException dateTimeParseException) {
					try {
						throw new StudentException(IStudentExceptionMessages.MESSAGE5);
					} catch (StudentException studentException) {
						System.out.println(studentException.getMessage());
					}
				}
				StudentDto studentDTO = new StudentDto();
				studentDTO.setAge(age);
				studentDTO.setCity(city);
				studentDTO.setEmail(email);
				studentDTO.setGender(gender.charAt(0));
				studentDTO.setName(name);
				studentDTO.setNumber(number);
				studentDTO.setDateOfJoining(date);
				boolean validationResult = false;
				try {
					validationResult = service.validatedetails(studentDTO);
				} catch (StudentException studentException) {
					System.out.println(studentException.getMessage());
				}
				if (validationResult) {
					Integer id = service.addStudent(studentDTO);
					System.out.println("ID: " + id + "  " + studentDTO.getStatus());
				}
				break;
			case 2:
				System.out.println("Enter Id: ");
				int idd = scanner.nextInt();
				StudentDto dto = service.showStudent(idd);
				if (dto != null) {
					System.out.println("Student Name: " + dto.getName());
					System.out.println("Status: " + dto.getStatus());
					System.out.println("College: " + dto.getCollege());

				} else {
					System.out.println("Student Not Found");
				}
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
		} while (choice != 3);

	}
	private static void menu() {
		System.out.println("\n===MENU===");
		System.out.println("1. Add Student");
		System.out.println("2. Show Student Status");
		System.out.println("3. Exit");

	}

}
