package com.tuyen.ifelse;

public class Function {
	// chức năng tính tổng
	public int tinhTong(int a, int b) {
		return a + b;
	}

	// tính tiền điện ( nếu số điện nhỏ hơn 100 thì đơn giá là 1000 nếu lớn hơn 100 thì đơn giá là 2000)
	public int tienDien(int sd) {
		// khởi tạo biến để hứng kết quả
		int tongTien;
		
		// nếu số điện nhỏ hơn 100
		if (sd < 100) {
			tongTien = sd*1000;
		} 
		
		// nếu số điện lớn hơn 100
		else {
			tongTien = (sd-100)*2000 + 100*1000;
		}
		
		return tongTien;
	}
	
	// nhập vào tháng và in ra tên của tháng đó
	public String tenThang(int month) {
		// khởi tạo biến để hứng kết quả
		String ketQua = "";
		
		
		// các trường tháng
		switch (month) {
			case 1: 
				ketQua = "Tháng 1";
				break;
			case 2:
				ketQua = "Tháng 2";
				break;
			default:
				ketQua = "Tháng không đúng";
				break;
		}
		return ketQua;
	}
}
