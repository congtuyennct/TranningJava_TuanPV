package app;

public class IfElse {
	public void tranningIfElse() {
		// if( điều kiện) else
//		if(!true) System.out.println("Băng 1");
//		else System.out.println("khong bằng");
		
		// ví dụ: kiểm tra số truyền vào là chẵn hay lẻ
		int a = 10;
		
		// case a là chẵn
//		if(a % 2 == 0) {
//			System.out.println("a chẵn");
//		}
//		
//		// case a lẻ
//		else {
//			System.out.println("a lẻ");
//		}
//		
		// vd: nếu a chẵn thì in ra giá trị a
		// note: có if không thì ko lỗi những nếu else không thì lỗi
//		
//		if(true) System.out.println();
//		
//		if(false) System.out.println();
//		
//		if(true) {
//			if(false) {
//				
//			}
//			else {
//				
//			}
//		}
		
		// nếu số truyên vào lớn 0 và < 10 thì cộng thêm 1 còn nếu số truyền vào lớn hơn 10 và < 100 thì + 2,, nếu lớn 100 thì +3
		if(a > 0 && a < 10) {
			System.out.println(" cộng 1");
		}
		else if(a > 10 && a < 100) {
			System.out.println(" cộng 2");
		}
		else {
			System.out.println(" cộng 3");
		}
		
	}
	
	
	public int tinhTienDien(int number) {
		// khởi tạo các biến và gắn giá trị
		int money = 0; // vì khi mình cộng các giá trị thì nó hiểu 
		
		// xử lý logic
		// nếu số điện nhỏ hơn 10
		if(number <= 10) {
			money = number * 1000;
		}
		// nếu số điện lớn hơn 10 và nhỏ hơn 20
		// thì số điện sẽ tính bằng số điện trừ 10 để xem nó lơn hơn 10 bn rồi nhân với giá điện 2k 
		else if(number > 10 && number <= 20) {
			money = (number - 10) * 2000 + 10 * 1000;
		}
		// nếu số điện lớn hơn 20
		else {
			money = (number - 20) * 3000 + (20 - 10) * 2000 + 10 * 1000;
		}
			
		// trả về kết quả
		return money;
	}
}
