package com.cg.library.ui;

import java.util.Scanner;

import com.cg.library.exception.ValidateImpl;
import com.cg.library.service.ILibraryService;
import com.cg.library.service.LibraryServiceImpl;

public class Library {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ILibraryService service = new LibraryServiceImpl();
		int choice;
		do {
			System.out.println("Enter 1 to view member");
			System.out.println("Enter 2 to pay fine");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Id");
				String id = scanner.next();
				try {
					System.out.println(service.viewDetails(id));
				} catch (ValidateImpl e) {
					e.getMessage();
				}
				break;

			case 2:
				System.out.println("Enter the Id");
				String mId = scanner.next();
				System.out.println("Enter the amount to be paid");
				double amount = scanner.nextDouble();
				boolean output;
				try {
					output = service.payAmount(mId, amount);
					if (output) {
						System.out.println("Amount is paid succesfully");
					}else
						System.out.println("Payment unsuccesfull");
				} catch (ValidateImpl e) {
					e.getMessage();
				}
				
				break;
			default:
				System.out.println("wrong input");
				break;
			}
		} while (choice ==1 ||choice ==2);
		scanner.close();
	}

}
