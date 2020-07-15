package tranning;

public class Array {
	public void Array1() {
		// khai báo 1 mảng
		// Các kiểu dữ liệu của mảng ( bao gồm các kiểu dữ liệu nguyên thuỷ và đối
		// tượng)
		// kiểu dữ liệu [] tên mình đặt = {các giá trị tương ứng với kiểu dữ liệu khởi tạo mảng}

		// khởi tạo 1 mảng gán giá trị
		int[] arrayInt = { 1, 2, 3, 4, 5 };
		long[] arrayLong = { 1, 2, 3, 4, 5 };
		String[] arrayString = { "1", "2", "3" };

		// khởi tạo 1 mảng rỗng (int[10] : là mảng chỉ có 10 phần tử)
		int[] arrayEmpty = new int[10];

		// mảng bắt đầu đếm từ 0
		
		// System.out.println(arrayInt[0]);
		
		for(int i = 0; i < arrayEmpty.length; i++) {
			System.out.println(arrayEmpty[i]);
		}
		
		System.out.println(" -------------------------- ");
		// thêm 1 phần tử vào mảng
		arrayEmpty[1] = 10;
		
		// update 
		arrayEmpty[1] = 2;
		
		for(int i = 0; i < arrayEmpty.length; i++) {
			System.out.println(arrayEmpty[i]);
		}
		
	}
}
