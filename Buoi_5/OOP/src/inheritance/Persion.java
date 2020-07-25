package inheritance;

// đây là lớp cha
public class Persion {
	protected String id; // cmnd
	protected String name;

	public Persion(String id, String name) {
		System.out.println(" Chạy vào 2 tham số");
		this.id = id;
		this.name = name;
	}
	
	public Persion(String id) {
		System.out.println(" Chạy vào đấy 1 tham");
		this.id = id;
	}
	
	// con
	public Persion() {
		System.out.println("Xử lý gì đó ngay sau khi class persion đc khởi tạo");
		this.name = "tung";
	}

	// khi 1 class đc khởi tạo thì nó chính là chạy vào constructor không tham số
	// default
	// nếu mà class có constructor có tham số truyền vào
	// constructor : mục đích là để gán giá trị mặc định khi class đc khởi hoặc làm đó ngay sau khi class đc 
	// constructor mặc định là public

//	// constructor mặc định
//	public Persion() {
//		System.out.println("Mặc định");
//	}

	public void congViec() {
		
	}
}
