package com.tuyen.ifelse;

public class Main {
	public static void main(String[] args) {
		// khởi tạo đối tượng function
		Function function = new Function();
		
		// gọi chức năng tính tổng
		int ketQua = function.tinhTong(10, 5);
		
		System.out.println(ketQua);
		int tienDien = function.tienDien(200);
		System.out.println(tienDien);
		
		String tenThang = function.tenThang(7);
		
		System.out.println(tenThang);
	}
}
