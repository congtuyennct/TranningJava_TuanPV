package tranning.nct;

import java.util.Arrays;

public class While {
	public void javaWhile() {
		// biến chạy vòng lặp
		int i = 0;

		// i < 10 là điều kiện dừng vòng lặp
		while (i < 10) {
			// xử lý gì đó
			System.out.println(i);
			
			// break: khi gặp điều kiện nào đó thì thoát vòng lặp
			
			// giả sử khi i = 5 thì thoát ra khỏi vòng lặp
			if(i == 5) {
				break;
			}
			
			// tăng biến i sau khi xử lý gì đó
			i = i + 1; // bước nhảy vòng lặp
		}
	}
	
	
	public void javaFor() {
		for (int i = 0; i < 11; i++) {
			// continue: gặp điều kiện nào đó thì bỏ qua và chạy tiếp
			// giả sử ko in ra số 5
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void javaDoWhile() {
		// khởi tạo giá trị vòng lặp
		int i = 0;
		// chắc chắn sẽ chạy vào bên trong do 1 lần dù kiện sai
		do {
			// xử lý
			
			System.out.println(i);
			// tăng bước nhảy lên 1
			i++;
		} while (i < 10);
	}
	
	// foreach: vòng lặp kiểu đổi tượng
	public void javaForeach() {
		for (int item : Arrays.asList(1)) {
			System.out.println(item);
		}
	}
}
