package baitap;

import java.util.Scanner;

public class EmployeeFullTime extends Employee{
	private String position; // chuc vu
	private int addDate;
	
	@Override
	public void showSalary() {
		int resutl = this.addDate * 800;
		
		// case position boss
		if(this.position.equals("sep")) {
			resutl = resutl +  20000; // tuong duong resutl += 20000;
		}else {
			resutl += 10000;
		}
		
		super.setSalary(resutl);
	}
	
	public void nhap() {
		System.out.print("a");
		Scanner scanner = new Scanner(System.in);
		// goi den phuong thuc nhap cua thang cha
		super.nhap();
		System.out.print("\n Chuc vu: ");
		this.position = scanner.nextLine();
		System.out.println("\n So ngay lam them: ");
		this.addDate = scanner.nextInt();
	}
	
	public void hienThi() {
		// goi den phuong thuc xuat cua thang cha
		super.hienThi();
		System.out.println("\n Chuc vu: " + this.position);
		System.out.println("\n So ngay lam them: " + this.addDate);
		System.out.println("\n Luong: " + super.getSalary());
	}
}
