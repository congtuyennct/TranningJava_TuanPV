package com.tuyen;

public class Student {
	// phạm vi truy cập + kiểu dữ liệu + tên biến
	private int id;
	private String name;
	
	// gai báo phương thức getter và setter để truy cập vào 1 thuộc tính trong đối tượng
	public int getId() {
		System.out.println("Chạy vào getter");
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
