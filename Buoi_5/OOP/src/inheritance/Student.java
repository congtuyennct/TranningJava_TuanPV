package inheritance;

// lớp con của đối tượng persion
public class Student extends Persion{
	private String age;
	
	// chạy vào constructor ko tham số đầu tiên
	public Student() {
		super();     						 // super chính là thuộc tính gọi đến thằng cha của nó
							// chính là khởi tạo constructor truyền vào tham số cho thằng cha
	}

	// khi thuộc tính của đối tượng có phạm vi truy cập là private thì ta phải dùng getter và setter để lấy ra giá trị và set giá trị cho thuộc tính đó.
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public void congViec() {
		System.out.println("học");
	}
}
