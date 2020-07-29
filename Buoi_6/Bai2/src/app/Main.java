package app;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		PhoneBook phoneBook = new PhoneBook();
		boolean flag = true;
		String name;
		String phone;
		int key;

		while (flag) {
			System.out.println(" ------- Các chức năng của hệ thống -------");
			System.out.println("1. Insert Phone");
			System.out.println("2. Remove Phone");
			System.out.println("3. Update Phone");
			System.out.println("4. Search Phone");
			System.out.println("5. Sort");
			System.out.println("6. Exit");
			System.out.print(" Vui lòng chọn chức năng:  ");
			key = scanner.nextInt();

			switch (key) {
			case 1:
				scanner.nextLine();
				System.out.println(" Vui lòng nhập thông tin ");
				System.out.print("Nhập name: ");
				name = scanner.nextLine();
				System.out.print("Nhập phone: ");
				phone = scanner.nextLine();
				phoneBook.insertPhone(name, phone);
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				System.err.println(" Cảm ơn bạn đã dùng phần mềm ");
				flag = false;
				break;
			default:
				System.err.println(" Cảm ơn bạn đã dùng phần mềm ");
				flag = false;
				break;
			}
		}
	}
}
