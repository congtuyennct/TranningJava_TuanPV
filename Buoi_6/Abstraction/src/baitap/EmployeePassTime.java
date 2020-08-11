package baitap;

import java.util.Scanner;

public class EmployeePassTime extends Employee{
	private int countHour;
	
	@Override
	public void showSalary() {
		super.setSalary(100 * this.countHour);
	}
	
	public void nhap() {
		System.out.print("c");
		Scanner scanner = new Scanner(System.in);
		// goi den phuong thuc nhap cua thang cha
		super.nhap();
		System.out.print("\n So gio lam viec: ");
		this.countHour = scanner.nextInt();
	}
	
	public void hienThi() {
		// goi den phuong thuc xuat cua thang cha
		super.hienThi();
		System.out.println("\n So gio lam viec: " + this.countHour);
		System.out.println("\n Luong: " + super.getSalary());
	}
}
