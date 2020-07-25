package inheritance;

public class Main {
	public static void main(String[] args) {
		//khi mk khởi tạo mà chuyền tham số thì nó chạy vào thằng contructor tương ứng với tham số mk chuyền vào
		
		Student student = new Student();
		
		// set giá trị id cho thằng student
		student.id = "1";
		
		student.congViec();
		// xây dựng phần mềm quản lý trong trường học mầm non
		
		// Xây dựng 1 thằng chung chữa những thuộc tính chung của 2 thằng sinh viên vào giáo viên
		
		// thì bây giờ mk xe sử dụng nó 
		
		
		// tại vì khi 2 thằng cha có 1 phương thức hoặc thuộc có tên giống nhau thì ở thằng con sẽ ko biết lấy cái thằng cha nào
	}
}
