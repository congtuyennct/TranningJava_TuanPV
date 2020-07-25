package inheritance2;

public class Persion {
	private String id;
	private String name;
	
	// mục địch của nó là để các thằng con khác dùng chung mà ko cần thằng nào cũng phải viết lại phương thức này
	// giả sử lớp người thì hành động ngủ 
	public void sleep() {
		System.out.println("ngủ");
	}
	
	public void sleep(int s) {
		System.out.println("ngủ");
	}
	
	public void salary() {
		
	}
	
	// quy định thằng người nào cũng có phương thức làm việc
	// giả sử lớp người có phương thức làm việc
	public void work() {
		System.out.println("làm việc");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
