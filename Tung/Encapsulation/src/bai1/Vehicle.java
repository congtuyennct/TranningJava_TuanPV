package bai1;

import java.util.Scanner;

public class Vehicle {
	private long giaXe;
	private int dungTichXyLanh;

	public Vehicle() {
		super();
	}

	public Vehicle(long giaXe, int dungTichXyLanh) {
		super();
		this.giaXe = giaXe;
		this.dungTichXyLanh = dungTichXyLanh;
	}

	public void tienThue() {
		float thue = 0;
		if (this.dungTichXyLanh < 100) {
			thue = (float) this.giaXe * 1 / 100;
		} else if (this.dungTichXyLanh >= 100 & this.dungTichXyLanh <= 200) {
			thue = (float) this.giaXe * 3 / 100;
		} else {
			thue = (float) this.giaXe * 5 / 100;
		}
		System.out.println("Tiền thuế của các xe: " + thue);
	}

	public void nhap() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap thong tin xe");
		System.out.print("Gia xe: ");
		this.giaXe = scanner.nextLong();
		scanner.nextLine();
		System.out.print("Dung tich xy lanh: ");
		this.dungTichXyLanh = scanner.nextInt();
	}

	public long getGiaXe() {
		return giaXe;
	}

	public void setGiaXe(long giaXe) {
		this.giaXe = giaXe;
	}

	public int getDungTichXyLanh() {
		return dungTichXyLanh;
	}

	public void setDungTichXyLanh(int dungTichXyLanh) {
		this.dungTichXyLanh = dungTichXyLanh;
	}
}
