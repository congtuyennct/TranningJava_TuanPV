package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean flag = true;
		List<Vehicle> vehicles = new ArrayList<>();
		while (flag) {
			Scanner scanner = new Scanner(System.in);
			int item;

			System.out.println("------ Cac chuc nang cua he thong------");
			System.out.println("1. Tạo các đối tượng xe và nhập thông tin");
			System.out.println("2. Xuất bảng kê khai tiền thuế của các xe");
			System.out.println("3. Thoát");

			System.out.print("Ban chon chuc nang: ");
			item = scanner.nextInt();
			switch (item) {
			case 1:
				Vehicle vehicle = new Vehicle();
				vehicle.nhap();
				vehicles.add(vehicle);
				break;
			case 2:
				for (int i = 0; i < vehicles.size(); i++) {
					vehicles.get(i).tienThue();
				}
				break;
			case 3:
				System.err.println("Cam on ban da dung phan mem");
				flag = false;
				break;
			default:
				System.out.println("Ban chon sai vui long chon lai!");
				break;
			}
		}
	}
}
