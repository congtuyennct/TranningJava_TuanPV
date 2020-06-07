package com.tuyen;

public class Main {

	// chức năng này tính tổng và trả về giá trị
	public int tinhTong() {
		int a = 0;
		int b = 1;
		return a+b;
	}
	
	public static int tinhTongCach2() {
		int a = 0;
		int b = 1;
		return a+b;
	}
	
	public static void main(String[] args) {
		// cách khởi tạo đối tượng
		// Tên class của đối tượng + tên cần đặt = new Tên class đối tượng();
		Student student = new Student();
		
		// cách gọi ra 1 thuộc tính trong đối tượng
		student.getId();
		student.getName();
//		System.out.println("Chay project java");
		
		
		// cách khai báo biến trong java
		int a = 0;
		int b = 1;
		
		// cách 1: khởi tạo đối tượng rồi còn đến function trong đối tượng đó
		Main main = new Main();
		System.out.println(main.tinhTong());
		
		// cách 2 : khai báo static cho function
		System.out.println(Main.tinhTongCach2());
		
		// cách 3: chỉ dùng đc khi mk gọi trong thằng class của chính nó (khi thằng đó ko phải là main)
	}
}
