package app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// khởi tao class Bai2
		Bai2 bai2 = new Bai2();

		// khởi tạo biến để hứng kết quả
		String ketQua;

		// gọi chức năng giải phương trình bậc 2
		ketQua = bai2.giaiPhuongTrinhBac2(1, 4, 4);

		// in ra kết quả
		System.out.println(ketQua);
		
		// gọi trực tiếp chức năng giải phương trình bậc 2
		bai2.giaiPhuongTrinhBac2Void(1, 4, 4);
		
		// cách nhập ký tự từ bàn phím trong java
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập giá trị từ bàn phím: ");
		int a = scanner.nextInt();
		System.out.println(a);
		
		System.out.print("Nhập giá trị từ bàn phím: ");
		String b = scanner.next();
		System.out.println(b);
	}

}
