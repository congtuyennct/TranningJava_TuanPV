package baitap;

import java.util.Scanner;

public abstract class Employee {
	private String name;
	private String typeEmployee;
	private int salary;

	public abstract void showSalary();

	public void nhap() {
		System.out.print("b");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vui long nhap thong tin nhan vien ");
		System.out.print(" Nhap ten: ");
		this.name = scanner.nextLine();
		System.out.println("\n Nhap loai nhan vien: "); // nhap 1: nhân viên toàn thời gian, 2: nhân viên ban thời gian
		if (scanner.nextLine().equals("1")) {
			this.typeEmployee = "Nhân viên toàn thời gian";
		} else {
			this.typeEmployee = "Nhân viên ban thời gian";
		}
	}

	public void hienThi() {
		System.out.println("Thong tin nhan vien");
		System.out.println("Ten: " + this.name);
		System.out.println("Loai nhan vien: " + this.typeEmployee);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeEmployee() {
		return typeEmployee;
	}

	public void setTypeEmployee(String typeEmployee) {
		this.typeEmployee = typeEmployee;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
