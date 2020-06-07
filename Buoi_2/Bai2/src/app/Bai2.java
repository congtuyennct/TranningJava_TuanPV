package app;

public class Bai2 {

	// trả về kết quả giải phương trình ( sang bên main để in kết quả)
	public String giaiPhuongTrinhBac2(int a, int b, int c) {
		// khởi tao các biến cần dùng
		String ketQua = "";
		int delta;
		double x1;
		double x2;

		// TH1: Nếu a == 0
		if (a == 0) {
			x1 = x2 = -c / b;
		}
		// TH2: Nếu a != 0
		else {
			// tính delta
			delta = b * b - 4 * a * c;

			// TH1: delta < 0
			if (delta < 0) {
				ketQua = "Phương trình vô nghiệm";
			}

			// TH2: delta == 0
			else if (delta == 0) {
				x1 = -b / (2 * a);

				ketQua = "Phương trình có nghiệm x1 = x2 = " + x1;
			}

			// TH3: delta > 0
			else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);

				ketQua = "Phương trình có nghiệm x1 = " + x1 + " x2 = " + x2;
			}
		}

		// trả về kết quả
		return ketQua;
	}

	// không trả về kết quả giải phương trình ( xử lý in kết quả luôn trong chức
	// năng)
	public void giaiPhuongTrinhBac2Void(int a, int b, int c) {
		// khởi tao các biến cần dùng
		int delta;
		double x1;
		double x2;

		// TH1: Nếu a == 0
		if (a == 0) {
			x1 = x2 = -c / b;
		}
		// TH2: Nếu a != 0
		else {
			// tính delta
			delta = b * b - 4 * a * c;

			// TH1: delta < 0
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			}

			// TH2: delta == 0
			else if (delta == 0) {
				x1 = -b / (2 * a);
				System.out.println("Phương trình có nghiệm x1 = x2 = " + x1);
			}

			// TH3: delta > 0
			else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phương trình có nghiệm x1 = " + x1 + " x2 = " + x2);
			}
		}
	}
}
